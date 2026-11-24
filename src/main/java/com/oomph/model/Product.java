package com.oomph.model;

public class Product {
    private static int productCount = 0;

    private String name;
    private long priceInCents;
    private int availableStock;

    public Product(String name, int priceInCents, int availableStock) {
        if(name == null || name.isBlank()) {
            throw new IllegalArgumentException("Product name is required");
        }

        if(priceInCents < 0) {
            throw new IllegalArgumentException("Price can not be negative");
        }

        if(availableStock < 0) {
            throw new IllegalArgumentException("Available stock can not be negative");
        }

        this.name = name;
        this.priceInCents = priceInCents;
        this.availableStock = availableStock;
    }

    public String getName() {
        return name;
    }

    public long getPriceInCents() {
        return priceInCents;
    }

    public int getAvailableStock() {
        return availableStock;
    }

    public boolean reduceStock(int quantity) {
        if (quantity <= 0 || quantity > availableStock) {
            return false;
        }
        availableStock -= quantity;
        return true;
    }

    public void increaseStock(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be positive");
        }
        availableStock += quantity;
    }

    public void displayProductDetails() {
        System.out.println("Product: " + name);
        System.out.println("Price: €" + priceInCents / 100.0);
        System.out.println("Stock: " + availableStock);
    }
}
