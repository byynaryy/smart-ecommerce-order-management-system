package com.oomph.model;

public class PayPalPayment implements PaymentMethod {
    @Override
    public void pay(long amountInCents) {
        System.out.println("Processing PayPal payment: €" + amountInCents / 100.0);
    }
}
