package com.rpbrehm.petexercise.repository;

import com.rpbrehm.petexercise.model.Pet;
import com.rpbrehm.petexercise.model.PetSearchCriteria;

import java.util.*;
import java.util.stream.Collectors;

/*
 A simple repository for creating data objects
 */
public class PetRepository {

    private Optional<List<Pet>> pets= Optional.empty();

    public void addPet(Pet pet) {
        if (!pets.isPresent()) {
            pets = Optional.ofNullable(new ArrayList<>());
        }
        pets.get().add(pet);
    }

    public Optional<List<Pet>> getPets() {
        return pets;
    }

    public Optional<List<Pet>> findPets(PetSearchCriteria petSearchCriteria) {
        List<Pet> petsInList;

        // Nothing to do if there are no pets
        if (pets.isPresent()) {
            // Save the list as a tree set.  This is so each filtered list will not create duplicates.
            petsInList = new ArrayList<>(pets.get());

            if (petSearchCriteria.getZipCode().isPresent()) {
                petsInList = petsInList.stream()
                .filter(pet -> pet.getZipCode().equals(petSearchCriteria.getZipCode().get()))
                .collect(Collectors.toCollection(ArrayList::new));
            }
            if (petSearchCriteria.getPetGender().isPresent()) {
                petsInList = petsInList.stream()
                .filter(pet -> pet.getPetGender().equals(petSearchCriteria.getPetGender().get()))
                .collect(Collectors.toCollection(ArrayList::new));
            }
            if (petSearchCriteria.getPetType().isPresent()) {
                petsInList = petsInList.stream()
                .filter(pet -> pet.getPetType().equals(petSearchCriteria.getPetType().get()))
                .collect(Collectors.toCollection(ArrayList::new));
            }
            if (petsInList.isEmpty()) {
                return Optional.empty();
            } else {
                return Optional.ofNullable(new ArrayList<Pet>(petsInList));
            }

        }
        else {
            return Optional.empty();
        }
    }

}
