package com.example.fitz.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserTests {

    private User user;

    @BeforeEach
    public void setUp() throws Exception{
        user = new User();
    }

    @Test
    @DisplayName("Check if net payable amount is right")
    public void testGetNetPayableAmount(){
        user.setDiscount(0.3);
        assertEquals(70, user.getNetPayableAmount(100), "net payable amount calculation should work");
    }
    
}
