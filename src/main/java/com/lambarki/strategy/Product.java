package com.lambarki.strategy;

public class Product {
    private String name;
    private double price;
    private DiscountStrategy discountStrategy;

    public Product(String name, double price, DiscountStrategy discountStrategy) {
        this.name = name;
        this.price = price;
        this.discountStrategy = discountStrategy;
    }

    public double getPrice() {
        return price;
    }

    public double getPriceWithDiscount() {
        double discount = discountStrategy.calculateDiscount(price);
        return price - discount;
    }
}
