package com.rpbrehm.petexercise.model;

public enum PetType {

    DOG ("dog"), CAT("cat"), RABBIT("rabbit");

    private String displayName;

    PetType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

}
