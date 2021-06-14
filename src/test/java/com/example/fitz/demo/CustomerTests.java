package com.example.fitz.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CustomerTests {
    
    private Customer customer1, customer2;

    @BeforeEach
    public void setUp() throws Exception{
        customer1 = new Customer(6);
        customer2 = new Customer(1);
    }

    @Test
    @DisplayName("Check calculation accuracy")
    public void testGetNetPayableAmount(){
        assertEquals(95, customer1.getNetPayableAmount(100), "net payable amount calculation should be accurate");
        assertEquals(100, customer2.getNetPayableAmount(100), "net payable amount calculation should be accurate");
    }

}
