package com.lambarki.Decorator;

class Pepperoni extends ToppingDecorator {
    public Pepperoni(Pizza pizza) {
        super(pizza);
    }

    public double getCost() {
        return pizza.getCost() + 2.00;
    }
}