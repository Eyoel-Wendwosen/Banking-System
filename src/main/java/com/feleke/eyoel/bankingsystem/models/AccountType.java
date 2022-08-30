package com.feleke.eyoel.bankingsystem.models;

public enum AccountType {
    CHECKING("Checking"),
    SAVING("Saving");

    private String type;

    AccountType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
