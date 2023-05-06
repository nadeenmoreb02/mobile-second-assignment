package com.example.myapplication;

public class Grammer {
    private String topic;
    private String definition;
    private String example;

    public Grammer(String topic, String definition, String example) {
        this.topic = topic;
        this.definition = definition;
        this.example = example;
    }

    public String getTopic() {
        return topic;
    }

    public String getDefinition() {
        return definition;
    }

    public String getExample() {
        return example;
    }
}
