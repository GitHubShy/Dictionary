package com.eng.shy.dictionaryspell.data;

import com.eng.shy.dictionaryspell.pojo.Question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class VocabularyRepo {
    private static VocabularyRepo mRepo = null;

    private VocabularyRepo() {
        mAllQuestions.put("日常",getNormalRepo());
    }

    public static VocabularyRepo getInstance() {
        mRepo = new VocabularyRepo();
        return mRepo;
    }
    private HashMap<String,List> mAllQuestions = new HashMap();

    public HashMap<String, List> getmAllQuestions() {
        return mAllQuestions;
    }

    private List<Question> getNormalRepo() {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("一月","January"));
        questions.add(new Question("二月","February"));
        questions.add(new Question("三月","March"));
        questions.add(new Question("四月","April"));
        questions.add(new Question("五月","May"));
        questions.add(new Question("六月","June"));
        questions.add(new Question("七月","July"));
        questions.add(new Question("八月","August"));
        questions.add(new Question("九月","September"));
        questions.add(new Question("十月","October"));
        questions.add(new Question("十一月","November"));
        questions.add(new Question("十二月","December"));

        questions.add(new Question("星期一","Monday"));
        questions.add(new Question("星期二","Tuesday"));
        questions.add(new Question("星期三","Wednesday"));
        questions.add(new Question("星期四","Thursday"));
        questions.add(new Question("星期五","Friday"));
        questions.add(new Question("星期六","Saturday"));
        questions.add(new Question("星期日","Sunday"));

        questions.add(new Question("举例说明","illustrate"));
        questions.add(new Question("论证;证明，证实;显示，展示;演示，说明","demonstrate"));
        questions.add(new Question("信心;信任;秘密","confidence"));
        questions.add(new Question("确信的，深信的;有信心的，沉着的;大胆的，过分自信的;厚颜无耻的","confident"));
        questions.add(new Question("n.金融;财政;资金;财源","finance"));
        questions.add(new Question("adj经济的;经济学的;合算的;有经济效益的","economic"));
        questions.add(new Question("n经济;节约;理财;秩序","economy"));
        questions.add(new Question("adj方便的","convenient"));
        questions.add(new Question("n方便，便利;","convenience"));

        questions.add(new Question("n.恩惠;赞同;帮助;善行","favour"));
        questions.add(new Question("n.野餐郊游;供野餐吃的食品;猪的肩肉;轻松的工作","picnic"));
        return questions;
    }
}
