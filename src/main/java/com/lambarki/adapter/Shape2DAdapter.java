package com.lambarki.adapter;

// Classe Shape2DAdapter qui implémente Shape2D en utilisant Shape
class Shape2DAdapter implements Shape2D {
    private Shape shape;

    public Shape2DAdapter(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void drawShape() {
        shape.draw();
    }
}