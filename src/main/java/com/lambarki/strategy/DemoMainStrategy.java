package com.lambarki.strategy;

public class DemoMainStrategy {
    public static void main(String[] args) {
        // Créer des produits avec différentes stratégies de remise
        Product phone = new Product("Phone", 1000, new ElectronicsDiscountStrategy());
        Product book = new Product("Book", 20, new BooksDiscountStrategy());
        Product shirt = new Product("Shirt", 50, new ClothingDiscountStrategy());

        // Ajouter les produits au panier d'achats
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(phone);
        cart.addProduct(book);
        cart.addProduct(shirt);

        // Calculer le montant total de la commande
        double totalPrice = cart.getTotalPrice();
        System.out.println("Total price with discount: " + totalPrice);
    }
}
