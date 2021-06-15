package com.example.fitz.demo;

public abstract class User {

    private double discount = 0;

    protected User(double discount){
        setDiscount(discount);
    }

    private double hundredDollarBillDiscount(double bill){
        return Math.floor(bill/100) * 5;
    }

    protected void setDiscount(double discount){
        this.discount = discount;
    }

    public double getNetPayableAmount(double bill){
        return bill - (bill * discount) - hundredDollarBillDiscount(bill);
    }
    
}
