package com.lambarki.Decorator;

public class DemoDecorator {

    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        System.out.println("Pizza simple: " + pizza.getCost());

        pizza = new Cheese(pizza);
        System.out.println("Pizza avec fromage: " + pizza.getCost());

        pizza = new Pepperoni(pizza);
        System.out.println("Pizza avec fromage et pepperoni: " + pizza.getCost());
    }
}

