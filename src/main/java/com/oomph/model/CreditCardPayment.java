package com.oomph.model;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(long amountInCents) {
        System.out.println("Processing credit card payment: €" + amountInCents / 100.0);
    }
}
