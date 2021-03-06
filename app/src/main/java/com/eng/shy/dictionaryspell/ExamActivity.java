package com.eng.shy.dictionaryspell;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.TextView;

import com.eng.shy.dictionaryspell.adapter.WrongWordsAdapter;
import com.eng.shy.dictionaryspell.data.VocabularyRepo;
import com.eng.shy.dictionaryspell.pojo.Question;
import com.eng.shy.dictionaryspell.utils.StringUtil;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExamActivity extends AppCompatActivity {

    private TextView mQuestion;
    private TextView mBox;
    private TextView mSure;
    private TextView mShowAllWords;
    private TextView mScore;
    private TextView mShowWrongWords;
    private TextView mShowPhonetic;
    private TextView mPhonetic;
    private RecyclerView mRecycleView;

    private List<Question> mInitialQuestionRepository;
    private List<Question> mQuestionRepository = new ArrayList<>();
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
        mShowAllWords = findViewById(R.id.display_all_words);
        mScore = findViewById(R.id.score_value);
        mShowPhonetic = findViewById(R.id.phonetic_button);
        mPhonetic = findViewById(R.id.phonetic);
        mRecycleView = findViewById(R.id.wrong_words);
        mShowWrongWords = findViewById(R.id.check_wrong_word);
        mShowWrongWords.setOnClickListener(v -> showWrongWords());
        mSure.setOnClickListener(v -> estimate());
        mBox.setOnEditorActionListener((v, actionId, event) -> {
            //当actionId == XX_SEND 或者 XX_DONE时都触发
            //或者event.getKeyCode == ENTER 且 event.getAction == ACTION_DOWN时也触发
            //注意，这是一定要判断event != null。因为在某些输入法上会返回null。
            if (actionId == EditorInfo.IME_ACTION_SEND
                    || actionId == EditorInfo.IME_ACTION_DONE
                    || (event != null && KeyEvent.KEYCODE_ENTER == event.getKeyCode() && KeyEvent.ACTION_DOWN == event.getAction())) {
                estimate();
            }
            return false;
        });
        mShowPhonetic.setOnClickListener(v -> mPhonetic.setVisibility(View.VISIBLE));
        mShowAllWords.setOnClickListener(v -> showAllWords());
    }


    private void initData() {
        mTitle = getIntent().getStringExtra("title");
        mInitialQuestionRepository = VocabularyRepo.getInstance().getmAllQuestions().get(mTitle);
        mQuestionRepository.addAll(mInitialQuestionRepository);
        mRepoSize = mInitialQuestionRepository.size();

        displayQuestion();
    }


    private void displayQuestion() {
        Random random = new Random();
        Integer randomKey = random.nextInt(mQuestionRepository.size());
        mCurrentQuestion = mQuestionRepository.get(randomKey);
        mQuestion.setText(mCurrentQuestion.getChineseExplanation());
        mPhonetic.setText(mCurrentQuestion.getPhonetic());
        mPhonetic.setVisibility(View.GONE);
        mBox.setText("");
    }

    private void estimate() {
        String text = mBox.getText().toString().trim();

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

    private void showAllWords() {
        WrongWordsAdapter wrongWordsAdapter = new WrongWordsAdapter(mInitialQuestionRepository);
        mRecycleView.setLayoutManager(new LinearLayoutManager(this));
        mRecycleView.setAdapter(wrongWordsAdapter);
    }


}
