package com.eng.shy.dictionaryspell.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.eng.shy.dictionaryspell.R;
import com.eng.shy.dictionaryspell.pojo.Catalogue;
import com.eng.shy.dictionaryspell.pojo.Question;

import java.util.List;


public class WrongWordsAdapter extends RecyclerView.Adapter<WrongWordsAdapter.WrongWordViewHolder>{

    private List<Question> mData;

    public WrongWordsAdapter(List<Question> mData) {
        this.mData = mData;
    }

    @NonNull
    @Override
    public WrongWordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.wrong_list,null,false);
        WrongWordViewHolder holder = new WrongWordViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull WrongWordViewHolder holder, final int position) {
        Question question = mData.get(position);
        holder.chinese.setText(question.getChinese());
        holder.rightWord.setText(question.getEnglish());
        holder.wrongWord.setText(question.getWrongEnglish());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class WrongWordViewHolder extends RecyclerView.ViewHolder{

        public TextView chinese;
        public TextView rightWord;
        public TextView wrongWord;

        public WrongWordViewHolder(View itemView) {
            super(itemView);
            chinese = itemView.findViewById(R.id.title);
            rightWord = itemView.findViewById(R.id.right_word);
            wrongWord = itemView.findViewById(R.id.wrong_word);
        }
    }

}
