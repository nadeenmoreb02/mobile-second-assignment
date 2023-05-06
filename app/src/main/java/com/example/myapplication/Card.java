package com.example.myapplication;

public class Card {
    private String frontText;
    private String backText;


    public Card(String frontText, String backText) {
        this.frontText = frontText;
        this.backText = backText;
    }

    public String getFrontText() {
        return frontText;
    }

    public void setFrontText(String frontText) {
        this.frontText = frontText;
    }

    public String getBackText() {
        return backText;
    }

    public void setBackText(String backText) {
        this.backText = backText;
    }

}
