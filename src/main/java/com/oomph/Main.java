package com.oomph;

import com.oomph.model.PremiumCustomer;

public class Main {
    public static void main(String[] args) {
        PremiumCustomer customer = new PremiumCustomer(
                101,
                "Alice",
                "alice@example.com",
                10
        );

        customer.displayCustomerDetails();
    }
}