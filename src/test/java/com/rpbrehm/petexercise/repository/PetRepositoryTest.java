package com.rpbrehm.petexercise.repository;

import com.rpbrehm.petexercise.model.Pet;
import com.rpbrehm.petexercise.model.PetGender;
import com.rpbrehm.petexercise.model.PetSearchCriteria;
import com.rpbrehm.petexercise.model.PetType;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class PetRepositoryTest {

    Map<Integer, Pet> pets = new HashMap<>();
    PetRepository petRepository;

    @Before
    public void setUp() throws Exception {

        pets.put(1, new Pet(1,"Snoopy", PetType.DOG, PetGender.MALE,"97205"));
        pets.put(2, new Pet(2,"Willow", PetType.CAT, PetGender.FEMALE,"97205"));
        pets.put(3, new Pet(3,"Yoda", PetType.DOG, PetGender.NEUTERED,"90210"));
        pets.put(4, new Pet(4,"Lassie", PetType.DOG, PetGender.SPAYED,"90210"));
        pets.put(5, new Pet(5,"Fluffly", PetType.RABBIT, PetGender.FEMALE,"97215"));
        pets.put(6, new Pet(6,"Rhea" , PetType.CAT, PetGender.SPAYED,"97215"));
        pets.put(7, new Pet(7,"Lese", PetType.CAT, PetGender.SPAYED,"97215"));
        pets.put(8, new Pet(8,"Rascal", PetType.DOG, PetGender.MALE,"97205"));

        petRepository = new PetRepository();

        petRepository.addPet(pets.get(1));
        petRepository.addPet(pets.get(2));
        petRepository.addPet(pets.get(3));
        petRepository.addPet(pets.get(4));
        petRepository.addPet(pets.get(5));
        petRepository.addPet(pets.get(6));
        petRepository.addPet(pets.get(7));
        petRepository.addPet(pets.get(8));

    }

    @Test
    public void addPet() throws Exception {
        // Expect
        assertEquals(petRepository.getPets().get().size(), 8);

    }

    @Test
    public void findPetsfor97210() throws Exception {
        // Setup
        PetSearchCriteria criteria = new PetSearchCriteria();
        criteria.createSearchCriteria();
        criteria.setZipCode("97210");

        // When
        Optional<List<Pet>> pets = petRepository.findPets(criteria);

        // Expect
        assertEquals(pets.get().size(), 2);

    }

}