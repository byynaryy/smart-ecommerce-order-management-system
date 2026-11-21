package com.oomph.model;

public class PremiumCustomer extends Customer {
    private double discountRate;

    public PremiumCustomer(int customerId, String name, String email, double discountRate) {
        super(customerId, name, email);

        if(discountRate < 0 || discountRate > 100) {
            throw new IllegalArgumentException("Discount rate must be between 0 and 100");
        }

        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public void displayCustomerDetails() {
        super.displayCustomerDetails();

        System.out.println("Customer type: Premium");
        System.out.println("Discount: " + discountRate + "%");
    }
}
