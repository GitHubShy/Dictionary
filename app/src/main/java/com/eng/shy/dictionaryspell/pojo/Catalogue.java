package com.eng.shy.dictionaryspell.pojo;


import java.util.List;

public class Catalogue {

    public Catalogue(String title, String accuracy) {
        this.title = title;
        this.accuracy = accuracy;
    }

    public String title;
    public String accuracy;
    public List<Question> question;
}
