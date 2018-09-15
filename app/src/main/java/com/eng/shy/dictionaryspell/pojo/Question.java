package com.eng.shy.dictionaryspell.pojo;

public class Question {
    private String chinese;
    private String english;
    private String wrongEnglish;
    private String phonetic;

    public Question(String chinese, String english) {
        this.chinese = chinese;
        this.english = english;
    }

    public Question(String chinese, String english, String phonetic) {
        this.chinese = chinese;
        this.english = english;
        this.phonetic = phonetic;
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
