package com.sda.mvc.model;

public enum Fatigue {

    TRIED("tried"), SLEEPING("");

    private String title;

    Fatigue(String title) {
        this.title = title;
    }
}
