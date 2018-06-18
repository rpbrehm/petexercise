package com.rpbrehm.petexercise.model;

public enum PetGender {

    MALE ("male"), FEMALE("female");

    private String displayName;

    PetGender(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

}
