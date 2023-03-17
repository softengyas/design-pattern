package com.lambarki.prototype;

// Utilisation du prototype
public class PrototypeDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setId("1");
        Circle clonedCircle = (Circle) circle.clone();
        clonedCircle.setId("2");

        System.out.println("Id du cercle original: " + circle.getId());
        System.out.println("Id du cercle cloné: " + clonedCircle.getId());
    }
}