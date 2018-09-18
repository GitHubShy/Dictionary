package com.eng.shy.dictionaryspell.pojo;

public class Question {
    private String english;
    private String englishExplanation;
    private String chineseExplanation;
    private String wrongEnglish;
    private String phonetic;

    public Question(String chineseExplanation, String english) {
        this.chineseExplanation = chineseExplanation;
        this.english = english;
    }

    public Question(String chineseExplanation, String english, String phonetic, String englishExplanation) {
        this.english = english;
        this.englishExplanation = englishExplanation;
        this.chineseExplanation = chineseExplanation;
        this.phonetic = phonetic;
    }

    public Question(String chineseExplanation, String english, String phonetic) {
        this.chineseExplanation = chineseExplanation;
        this.english = english;
        this.phonetic = phonetic;
    }

    public String getChineseExplation() {
        return chineseExplanation;
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

    public String getPhonetic() {
        return phonetic;
    }
}
