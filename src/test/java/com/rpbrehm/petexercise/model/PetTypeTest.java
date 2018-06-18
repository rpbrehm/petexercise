package com.rpbrehm.petexercise.model;

import static org.junit.Assert.*;

public class PetTypeTest {

    @org.junit.Test
    public void getDisplayNameCat() {

        //Expect
        assertEquals(PetType.CAT.getDisplayName(),"cat");
        assertEquals(PetType.DOG.getDisplayName(),"dog");
        assertEquals(PetType.RABBIT.getDisplayName(),"rabbit");

    }

}
