package com.lambarki.prototype;

// Implémentation concrète du prototype
public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Je dessine un cercle.");
    }
}