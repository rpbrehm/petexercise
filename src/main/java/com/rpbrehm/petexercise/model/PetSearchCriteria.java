package com.rpbrehm.petexercise.model;

import java.util.Optional;

public class PetSearchCriteria {

    private PetSearchCriteria petSearchCriteria;
    private Optional<PetType> petType = Optional.empty();;
    private Optional<PetGender> petGender = Optional.empty();
    private Optional<String> zipCode = Optional.empty();

    public void createSearchCriteria() {
        this.petSearchCriteria = new PetSearchCriteria();
    }

    public void setPetType(PetType petType) {
        this.petType = Optional.ofNullable(petType);
    }

    public void setPetGender(PetGender petGender) {
        this.petGender = Optional.ofNullable(petGender);
    }

    public void setZipCode(String zipCode) {
        this.zipCode = Optional.ofNullable(zipCode);
    }

    public Optional<PetType> getPetType() {
        return petType;
    }

    public Optional<PetGender> getPetGender() {
        return petGender;
    }

    public Optional<String> getZipCode() {
        return zipCode;
    }
}
