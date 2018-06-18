package com.rpbrehm.petexercise.model;

import static org.junit.Assert.*;

public class PetTypeTest {

    @org.junit.Test
    public void getDisplayNameCat() {

        //Expect
        assertEquals(PetType.CAT.getDisplayName(),"cat");
    }

    @org.junit.Test
    public void getDisplayNameDog() {

        //Expect
        assertEquals(PetType.DOG.getDisplayName(),"dog");
    }

    @org.junit.Test
    public void getDisplayNameRabbit() {

        //Expect
        assertEquals(PetType.RABBIT.getDisplayName(),"rabbit");
    }
}
