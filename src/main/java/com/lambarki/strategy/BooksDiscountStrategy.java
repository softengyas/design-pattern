package com.lambarki.strategy;

public class BooksDiscountStrategy implements DiscountStrategy {
    public double calculateDiscount(double price) {
        // Calculer la remise pour les livres
        return price * 0.05;
    }
}