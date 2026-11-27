package com.oomph.model;

public class Order {
    public  static final int MAX_ORDER_QUANTITY = 100;
    private Customer customer;
    private Product product;
    private int quantity;

    private OrderStatus status = OrderStatus.PENDING;

    public Order(Customer customer, Product product, int quantity) {
        if (customer == null) {
            throw new IllegalArgumentException("Customer is required");
        }

        if (product == null) {
            throw new IllegalArgumentException("Product is required");
        }

        if (quantity <= 0 || quantity > MAX_ORDER_QUANTITY) {
            throw new IllegalArgumentException("Quantity must be positive and not more than "+ MAX_ORDER_QUANTITY);
        }

        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public long calculateSubtotal() {
        return product.getPriceInCents() * quantity;
    }

    public void displayOrderSummary() {

        System.out.println("===== ORDER SUMMARY =====");

        System.out.println("Customer: " + customer.getName());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("Product: " + product.getName());
        System.out.println("Quantity: " + quantity);

        System.out.println(
                "Subtotal: €" + calculateSubtotal() / 100.0
        );
    }
}
