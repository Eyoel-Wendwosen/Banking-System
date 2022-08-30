package com.feleke.eyoel.bankingsystem.models;

public enum Sex {
    MALE ("Male"),
    FEMALE ("Female");

    private String type;

    Sex(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
