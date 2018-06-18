package com.rpbrehm.petexercise.model;

public class Pet {

    private int id;
    private String name;
    private PetType petType;
    private PetGender petGender;
    private String zipCode;

    public Pet(int id, String name, PetType petType, PetGender petGender, String zipCode) {
        this.id = id;
        this.name = name;
        this.petType = petType;
        this.petGender = petGender;
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

    public PetGender getPetGender() { return petGender; }

    public String getZipCode() {
        return zipCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pet pet = (Pet) o;

        if (id != pet.id) return false;
        if (name != null ? !name.equals(pet.name) : pet.name != null) return false;
        if (petType != pet.petType) return false;
        if (petGender != pet.petGender) return false;
        return zipCode != null ? zipCode.equals(pet.zipCode) : pet.zipCode == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (petType != null ? petType.hashCode() : 0);
        result = 31 * result + (petGender != null ? petGender.hashCode() : 0);
        result = 31 * result + (zipCode != null ? zipCode.hashCode() : 0);
        return result;
    }

}
