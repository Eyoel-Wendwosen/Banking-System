package com.feleke.eyoel.bankingsystem.models;

public enum UserType {
    CLIENT("client"),
    TELLER("teller"),
    ADMIN("admin");

    private String type;

    UserType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
