package com.lambarki.strategy;

public class ElectronicsDiscountStrategy implements DiscountStrategy {
    public double calculateDiscount(double price) {
        // Calculer la remise pour les produits électroniques
        return price * 0.1;
    }
}



