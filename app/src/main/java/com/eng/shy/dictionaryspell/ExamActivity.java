package com.eng.shy.dictionaryspell;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.eng.shy.dictionaryspell.adapter.WrongWordsAdapter;
import com.eng.shy.dictionaryspell.data.VocabularyRepo;
import com.eng.shy.dictionaryspell.pojo.Question;
import com.eng.shy.dictionaryspell.utils.StringUtil;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

public class ExamActivity extends AppCompatActivity {

    private TextView mQuestion;
    private TextView mBox;
    private TextView mSure;
    private TextView mScore;
    private TextView mShowWrongWords;
    private RecyclerView mRecycleView;

    private List<Question> mQuestionRepository;
    private List<Question> mWrongQuestion = new ArrayList<>();

    private Question mCurrentQuestion;

    private String mTitle;

    private int mRepoSize;
    private int mCorrectNum;
    private int mWrongNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);
        initView();
        initData();
    }

    private void initView() {
        mQuestion = findViewById(R.id.question);
        mBox = findViewById(R.id.answer_box);
        mSure = findViewById(R.id.submit);
        mScore = findViewById(R.id.score_value);
        mRecycleView = findViewById(R.id.wrong_words);
        mShowWrongWords = findViewById(R.id.check_wrong_word);
        mShowWrongWords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showWrongWords();
            }
        });
        mSure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                estimate();
            }
        });
    }


    private void initData() {
        mTitle = getIntent().getStringExtra("title");
        mQuestionRepository = VocabularyRepo.getInstance().getmAllQuestions().get(mTitle);
        mRepoSize = mQuestionRepository.size();

        displayQuestion();
    }


    private void displayQuestion() {
        Random random = new Random();
        Integer randomKey = random.nextInt(mQuestionRepository.size());
        mCurrentQuestion = mQuestionRepository.get(randomKey);
        mQuestion.setText(mCurrentQuestion.getChinese());
        mBox.setText("");
    }

    private void estimate() {
        String text = mBox.getText().toString();

        if (StringUtil.isEmpty(text) || !mCurrentQuestion.getEnglish().equals(text)) {
            mCurrentQuestion.setWrongEnglish(text);
            mWrongQuestion.add(mCurrentQuestion);
            mWrongNum++;
        } else {
            mCorrectNum++;
        }
        mQuestionRepository.remove(mCurrentQuestion);

        if (mQuestionRepository.size() == 0) {
            mScore.setVisibility(View.VISIBLE);
            DecimalFormat df = new DecimalFormat("0.00");
            mScore.setText(df.format((float) mCorrectNum / mRepoSize));
            showWrongWords();
        } else {
            displayQuestion();
        }

    }

    private void showWrongWords() {
        WrongWordsAdapter wrongWordsAdapter = new WrongWordsAdapter(mWrongQuestion);
        mRecycleView.setLayoutManager(new LinearLayoutManager(this));
        mRecycleView.setAdapter(wrongWordsAdapter);
    }
}
