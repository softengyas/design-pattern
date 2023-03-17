package com.lambarki.Decorator;

class PlainPizza implements Pizza {
    @Override
    public double getCost() {
        return 4.00;
    }
}