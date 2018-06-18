package com.rpbrehm.petexercise.model;

public class Pet {

    private int id;
    private String name;
    private PetType petType;
    private String zipCode;

    public Pet(int id, String name, PetType petType, String zipCode) {
        this.id = id;
        this.name = name;
        this.petType = petType;
        this.zipCode = zipCode;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public PetType getPetType() {
        return petType;
    }

    public String getZipCode() {
        return zipCode;
    }

}
