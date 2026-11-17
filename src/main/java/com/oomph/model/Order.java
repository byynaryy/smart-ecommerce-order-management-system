package com.oomph.model;

public class Order {
    private Customer customer;
    private Product product;
    private int quantity;

    public Order(Product product, int quantity) {
        if (product == null) {
            throw new IllegalArgumentException("Product is required");
        }

        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be positive");
        }

        this.product = product;
        this.quantity = quantity;
    }

    public int calculateSubtotal() {
        return product.getPriceInCents() * quantity;
    }

    public void displayOrderSummary() {

        System.out.println("===== ORDER SUMMARY =====");

        System.out.println("Product: " + product.getName());
        System.out.println("Quantity: " + quantity);

        System.out.println(
                "Subtotal: €" + calculateSubtotal() / 100.0
        );
    }
}
