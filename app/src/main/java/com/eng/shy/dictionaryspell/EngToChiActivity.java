package com.eng.shy.dictionaryspell;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.eng.shy.dictionaryspell.data.VocabularyRepo;
import com.eng.shy.dictionaryspell.pojo.Question;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EngToChiActivity extends AppCompatActivity {

    private TextView mEnglish;
    private TextView mChinese;
    private TextView mCheckAnswer;
    private TextView mKnown;
    private TextView mUnknown;

    private String mTitle;

    private List<Question> mInitialQuestionRepository;
    private List<Question> mQuestionRepository = new ArrayList<>();
    private List<Question> mWrongQuestion = new ArrayList<>();

    private Question mCurrentQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_to_chi);
        mEnglish = findViewById(R.id.english);
        mChinese = findViewById(R.id.chinese);
        mCheckAnswer = findViewById(R.id.check_answer);
        mKnown = findViewById(R.id.known);
        mUnknown = findViewById(R.id.unknown);

        mTitle = getIntent().getStringExtra("title");
        mInitialQuestionRepository = VocabularyRepo.getInstance().getmAllQuestions().get(mTitle);
        mQuestionRepository.addAll(mInitialQuestionRepository);

        displayQuestion();

        mKnown.setOnClickListener(view -> displayQuestion());
        mUnknown.setOnClickListener(view -> displayQuestion());
        mCheckAnswer.setOnClickListener(view -> checkAnswer ());

    }

    private void displayQuestion() {
        if (mQuestionRepository.size() < 1) {
            return;
        }
        Random random = new Random();
        Integer randomKey = random.nextInt(mQuestionRepository.size());
        mCurrentQuestion = mQuestionRepository.get(randomKey);
        mEnglish.setText(mCurrentQuestion.getEnglish());
        mChinese.setText(mCurrentQuestion.getChineseExplanation());
        mChinese.setVisibility(View.GONE);
        mQuestionRepository.remove(mCurrentQuestion);
    }

    private void checkAnswer () {
        mChinese.setVisibility(View.VISIBLE);
    }

}
