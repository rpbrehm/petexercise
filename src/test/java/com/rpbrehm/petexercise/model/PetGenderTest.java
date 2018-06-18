package com.rpbrehm.petexercise.model;

import static org.junit.Assert.assertEquals;

public class PetGenderTest {

    @org.junit.Test
    public void getDisplayNames() {

        //Expect
        assertEquals(PetGender.MALE.getDisplayName(),"male");
        assertEquals(PetGender.FEMALE.getDisplayName(),"female");

    }

}
