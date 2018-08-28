package com.eng.shy.dictionaryspell.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.eng.shy.dictionaryspell.R;
import com.eng.shy.dictionaryspell.pojo.Catalogue;

import java.util.List;


public class CatalogueAdapter extends RecyclerView.Adapter<CatalogueAdapter.CatalogueViewHolder> {

    private List<Catalogue> mData;

    private OnItemClickListener mClickListener;

    public void setmClickListener(OnItemClickListener mClickListener) {
        this.mClickListener = mClickListener;
    }

    public CatalogueAdapter(List<Catalogue> mData) {
        this.mData = mData;
    }

    @NonNull
    @Override
    public CatalogueViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.catalogue_list, null, false);
        CatalogueViewHolder holder = new CatalogueViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CatalogueViewHolder holder, final int position) {
        Catalogue catalogue = mData.get(position);
        holder.title.setText(catalogue.title);
        holder.accuracy.setText(catalogue.accuracy);
        holder.title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mClickListener.onItemClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class CatalogueViewHolder extends RecyclerView.ViewHolder {

        public TextView title;
        public TextView accuracy;

        public CatalogueViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            accuracy = itemView.findViewById(R.id.accuracy);
        }
    }

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

}
