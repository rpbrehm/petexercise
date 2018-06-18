package com.rpbrehm.petexercise.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PetTest {

    Pet pet;

    @Before
    public void setUp() throws Exception {
        pet = new Pet(1, "fido", PetType.DOG, PetGender.FEMALE, "09010");
    }

    @Test
    public void testGetters() {
        //Expect
        assertEquals(pet.getId(), 1);
        assertEquals(pet.getName(), "fido");
        assertEquals(pet.getPetType(), PetType.DOG);
        assertEquals(pet.getPetGender(), PetGender.FEMALE);
        assertEquals(pet.getZipCode(), "09010");

    }

}
