package com.lambarki.Decorator;

abstract class ToppingDecorator implements Pizza {
    protected Pizza pizza;

    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public double getCost() {
        return pizza.getCost();
    }
}