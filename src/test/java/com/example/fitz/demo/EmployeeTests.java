package com.example.fitz.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EmployeeTests {
    
    private Employee employee;

    @BeforeEach
    public void setUp() throws Exception{
        employee = new Employee();
    }

    @Test
    @DisplayName("Check calculation accuracy")
    public void testGetNetPayableAmount(){
        assertEquals(70, employee.getNetPayableAmount(100), "net payable amount calculation should be accurate");
    }

}
