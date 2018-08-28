package com.eng.shy.dictionaryspell.data;

import com.eng.shy.dictionaryspell.pojo.Question;

import java.util.ArrayList;
import java.util.List;

public class VocabularyRepo {
    public static List<Question> getNormalRepo() {
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
        return questions;
    }
}
