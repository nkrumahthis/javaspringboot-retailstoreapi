package com.example.fitz.demo;

public class MockUser {

    private double discount = 0;

    public void setDiscount(double discount){
        this.discount = discount;
    }

    public double getNetPayableAmount(double bill){
        return bill - (bill * discount);
    }
    
}
