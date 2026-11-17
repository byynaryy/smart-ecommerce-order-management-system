package com.oomph.model;

public class Customer {
    private int customerId;
    private String name;
    private String email;

    public  Customer(int customerId, String name, String email) {
        if(name==null || name.isBlank()) {
            throw  new IllegalArgumentException("name can not be empty");
        }

        if(email==null || email.isBlank()) {
            throw  new IllegalArgumentException("email can not be empty");
        }

        this.customerId = customerId;
        this.name = name;
        this.email = email;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

}
