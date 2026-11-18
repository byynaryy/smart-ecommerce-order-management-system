package com.oomph.model;

public class PremiumCustomer extends Customer {
    private double discountRate;

    public PremiumCustomer(int customerId, String name, String email) {
        super(customerId, name, email);
    }
}
