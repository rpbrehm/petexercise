package com.rpbrehm.petexercise.repository;

import com.rpbrehm.petexercise.model.Pet;
import com.rpbrehm.petexercise.model.PetSearchCriteria;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    public Optional<List<Pet>> findPet(PetSearchCriteria petSearchCriteria) {
        TreeSet<Pet> petsInTree;

        // Nothing to do if there are no pets
        if (pets.isPresent()) {
            // Save the list as a tree set.  This is so each filtered list will not create duplicates.
            petsInTree = new TreeSet<>();

            if (petSearchCriteria.getZipCode().isPresent()) {
                List<Pet> result = pets.get().stream()
                        .filter(pet -> pet.getZipCode().equals(petSearchCriteria.getZipCode().get()))
                        .collect(Collectors.toList());
                petsInTree.addAll(result);
            }
            if (petSearchCriteria.getPetGender().isPresent()) {
                List<Pet> result = pets.get().stream()
                        .filter(pet -> pet.getPetGender().equals(petSearchCriteria.getPetGender().get()))
                        .collect(Collectors.toList());
                petsInTree.addAll(result);
            }
            if (petSearchCriteria.getPetType().isPresent()) {
                List<Pet> result = pets.get().stream()
                        .filter(pet -> pet.getPetType().equals(petSearchCriteria.getPetType().get()))
                        .collect(Collectors.toList());
                petsInTree.addAll(result);
            }
            if (petsInTree.isEmpty()) {
                return Optional.empty();
            } else {
                return Optional.ofNullable(new ArrayList<Pet>(petsInTree));
            }

        }
        else {
            return Optional.empty();
        }
    }

}
