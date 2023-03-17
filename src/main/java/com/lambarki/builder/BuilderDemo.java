package com.lambarki.builder;

// Exemple d'utilisation du builder
public class BuilderDemo {
    public static void main(String[] args) {
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        PizzaDirector director = new PizzaDirector(hawaiianPizzaBuilder);
        director.makePizza();

        Pizza pizza = hawaiianPizzaBuilder.getPizza();

        System.out.println("Pizza: " + pizza.getDough() + ", " + pizza.getSauce() + ", " + pizza.getTopping());
    }
}