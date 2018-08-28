package com.eng.shy.dictionaryspell.pojo;

public class Question {
    private String chinese;
    private String english;
    private String wrongEnglish;

    public Question(String chinese, String english) {
        this.chinese = chinese;
        this.english = english;
    }

    public String getChinese() {
        return chinese;
    }

    public String getEnglish() {
        return english;
    }

    public String getWrongEnglish() {
        return wrongEnglish;
    }

    public void setWrongEnglish(String wrongEnglish) {
        this.wrongEnglish = wrongEnglish;
    }
}
