package com.lambarki.strategy;

public class ClothingDiscountStrategy implements DiscountStrategy {
    public double calculateDiscount(double price) {
        // Calculer la remise pour les vêtements
        return price * 0.2;
    }
}
