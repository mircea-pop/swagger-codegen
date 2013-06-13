package com.wordnik.petstore.api;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.wordnik.client.ApiException;
import com.wordnik.petstore.model.Pet;

public class PetApiTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void test() throws ApiException {
        PetApi petApi = new PetApi();
        List<Pet> availablePets = petApi.findPetsByStatus("available");

        assertTrue(availablePets.size() > 0);
    }

}
