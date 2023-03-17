package com.lambarki.builder;

public class HawaiianPizzaBuilder implements PizzaBuilder{
    private Pizza pizza;

    public HawaiianPizzaBuilder() {
        pizza = new Pizza();
    }

    public void buildDough() {
        pizza.setDough("croûte épaisse");
    }

    public void buildSauce() {
        pizza.setSauce("sauce tomate");
    }

    public void buildTopping() {
        pizza.setTopping("jambon et ananas");
    }

    public Pizza getPizza() {
        return pizza;
    }
}