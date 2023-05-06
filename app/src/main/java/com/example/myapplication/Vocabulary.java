package com.example.myapplication;

public class Vocabulary {
    private String name;
    private String definition;

    public Vocabulary(String name, String definition) {
        this.name = name;
        this.definition = definition;
    }

    public String getName() {
        return name;
    }

    public String getDefinition() {
        return definition;
    }
}
