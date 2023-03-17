package com.lambarki.adapter;

public class DemoAdapter {
    // Utilisation des classes avec le pattern Adapter
        public static void main(String[] args) {
            Rectangle rectangle = new Rectangle();
            Circle circle = new Circle();
            Graphics graphics = new Graphics();
            Shape2DAdapter rectangleAdapter = new Shape2DAdapter(rectangle);
            Shape2DAdapter circleAdapter = new Shape2DAdapter(circle);
            graphics.drawShape(rectangleAdapter); // Output: Drawing a rectangle
            graphics.drawShape(circleAdapter); // Output: Drawing a circle
        }
    }