package com.eng.shy.dictionaryspell;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.eng.shy.dictionaryspell.adapter.CatalogueAdapter;
import com.eng.shy.dictionaryspell.data.VocabularyRepo;
import com.eng.shy.dictionaryspell.pojo.Catalogue;

import java.util.ArrayList;
import java.util.HashMap;
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
        HashMap<String, List> repos = VocabularyRepo.getInstance().getmAllQuestions();
        for (String title : repos.keySet()) {
            mData.add(new Catalogue(title,"90%"));
        }
        mAdapter = new CatalogueAdapter(mData);
        mAdapter.setmClickListener((position, type) -> {
            Catalogue catalogue = mData.get(position);
            Intent i = new Intent();
            i.putExtra("title",catalogue.title);
            if (type == 1) {
                i.setClass(MainActivity.this,ExamActivity.class);
            } else if (type == 2) {
                i.setClass(MainActivity.this,EngToChiActivity.class);
            }
            startActivity(i);
        });
        mRecycleView.setAdapter(mAdapter);
    }

}
