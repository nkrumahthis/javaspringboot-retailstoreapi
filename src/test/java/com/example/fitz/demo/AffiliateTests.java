package com.example.fitz.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AffiliateTests {
    
    private Affiliate affiliate;

    @BeforeEach
    public void setUp() throws Exception{
        affiliate = new Affiliate();
    }

    @Test
    @DisplayName("Check calculation accuracy")
    public void testGetNetPayableAmount(){
        assertEquals(90, affiliate.getNetPayableAmount(100), "net payable amount calculation should be accurate");
    }

}
