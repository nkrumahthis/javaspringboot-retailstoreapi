package com.example.fitz.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MockUserTests {

    private MockUser user;

    @BeforeEach
    public void setUp() throws Exception{
        user = new MockUser();
    }

    @Test
    @DisplayName("Check if net payable amount is zero")
    public void testGetNetPayableAmount(){
        assertEquals(0, user.getNetPayableAmount(0), "net payable amount calculation should work");
        assertEquals(100, user.getNetPayableAmount(100), "net payable amount calculation should work");

    }

    @Test
    @DisplayName("Check if net payable amount is right")
    public void testSetDiscount(){
        user.setDiscount(0.3);
        assertEquals(70, user.getNetPayableAmount(100), "net payable amount calculation should be accurate");
    }


    @Test
    @DisplayName("100$ discounts")
    public void testHundredDollarDiscount(){
        user.setDiscount(0);
        assertEquals(261, user.getNetPayableAmount(271), "hundred dollar discount test should be accurate");
    }

    @Test
    @DisplayName("100$")
    public void testHundred(){
        user.setDiscount(0);
        assertEquals(95, user.getNetPayableAmount(100), "hundred dollar discount test should be accurate");
    }



    
}
