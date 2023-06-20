package com.example.myapplication;

public class Vowel {
    private String letter;
    private String example;
    private int img;

    public Vowel(String letter, String example, int img) {

        this.letter = letter;
        this.example = example;
        this.img = img;
    }

    public String getLetter() {
        return letter;
    }
    public String getExample() {
        return example;
    }

    public int getImg() {
        return img;
    }
}
