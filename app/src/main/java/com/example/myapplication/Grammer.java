package com.example.myapplication;

public class Grammer {
    private String topic;

    private String example;

    public Grammer(String topic, String example) {
        this.topic = topic;this.example = example;
    }

    public String getTopic() {
        return topic;
    }



    public String getExample() {
        return example;
    }
}
