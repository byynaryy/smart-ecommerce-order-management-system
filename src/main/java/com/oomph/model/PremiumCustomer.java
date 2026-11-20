package com.oomph.model;

public class PremiumCustomer extends Customer {
    private double discountRate;

    public PremiumCustomer(int customerId, String name, String email) {
        super(customerId, name, email);
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
