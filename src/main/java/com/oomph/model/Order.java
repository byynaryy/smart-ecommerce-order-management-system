package com.oomph.model;

public class Order {
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
}
