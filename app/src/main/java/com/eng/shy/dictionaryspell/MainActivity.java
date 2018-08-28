package com.eng.shy.dictionaryspell;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.eng.shy.dictionaryspell.adapter.CatalogueAdapter;
import com.eng.shy.dictionaryspell.pojo.Catalogue;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecycleView;
    private CatalogueAdapter mAdapter;
    private List<Catalogue> mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView() {
        mRecycleView = findViewById(R.id.recycle);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        mRecycleView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData() {
        mData = new ArrayList<>();
        mData.add(new Catalogue("日常","90%"));
        mData.add(new Catalogue("日常","90%"));
        mData.add(new Catalogue("日常","90%"));
        mData.add(new Catalogue("日常","90%"));
        mAdapter = new CatalogueAdapter(mData);
        mAdapter.setmClickListener(new CatalogueAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                startActivity(new Intent().setClass(MainActivity.this,ExamActivity.class));
            }
        });
        mRecycleView.setAdapter(mAdapter);
    }

}
