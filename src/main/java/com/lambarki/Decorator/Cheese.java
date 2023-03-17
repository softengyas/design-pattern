package com.lambarki.Decorator;

class Cheese extends ToppingDecorator {
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    public double getCost() {
        return pizza.getCost() + 1.25;
    }
}