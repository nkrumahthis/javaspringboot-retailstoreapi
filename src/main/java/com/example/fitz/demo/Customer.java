package com.example.fitz.demo;

public class Customer extends User{

    public Customer(int years) {
        super(0);

        if (years > 2){
            this.setDiscount(0.05);
        }
    }

}
