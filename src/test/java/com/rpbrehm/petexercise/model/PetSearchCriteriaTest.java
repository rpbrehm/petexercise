package com.rpbrehm.petexercise.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PetSearchCriteriaTest {

    PetSearchCriteria searchCriteria;

    @Before
    public void setUp() throws Exception {
        searchCriteria = new PetSearchCriteria();
    }

    @Test
    public void createSearchCriteria() throws Exception {

        // Expect
        assertNotNull(searchCriteria);
    }

    @Test
    public void testPetType() throws Exception {

        //Setup
        searchCriteria.setPetType(PetType.CAT);

        // Expect
        assertEquals(searchCriteria.getPetType(), PetType.CAT);
    }

    @Test
    public void testPetGender() throws Exception {

        //Setup
        searchCriteria.setPetGender(PetGender.FEMALE);

        // Expect
        assertEquals(searchCriteria.getPetGender(), PetGender.FEMALE);
    }

    @Test
    public void testZipCode() throws Exception {

        //Setup
        searchCriteria.setZipCode("12345");

        // Expect
        assertEquals(searchCriteria.getZipCode(), "12345");
    }

}