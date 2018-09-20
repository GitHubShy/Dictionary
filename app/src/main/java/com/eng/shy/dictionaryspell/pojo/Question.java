package com.eng.shy.dictionaryspell.pojo;

public class Question {
    private String english;
    private String englishExplanation;
    private String chineseExplanation;
    private String wrongEnglish;
    private String phonetic;

    private Question(Builder builder) {
        english = builder.english;
        englishExplanation = builder.englishExplanation;
        chineseExplanation = builder.chineseExplanation;
        englishExplanation = builder.englishExplanation;
        phonetic = builder.phonetic;
    }

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

    public String getChineseExplanation() {
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

    public String getEnglishExplanation() {
        return englishExplanation;
    }

    public static class Builder {

        private String english;
        private String englishExplanation;
        private String chineseExplanation;
        private String wrongEnglish;
        private String phonetic;

        public Builder(String english, String chineseExplanation,String phonetic) {
            this.english = english;
            this.chineseExplanation = chineseExplanation;
            this.phonetic = phonetic;
        }

        public Builder englishExplanation(String englishExplanation) {
            this.englishExplanation = englishExplanation;
            return this;
        }

        public Question build() {
            return new Question(this);
        }

    }
}
