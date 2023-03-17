package com.lambarki.observer;

class OctalObserver implements Observer {
    @Override
    public void update(int state) {
        System.out.println("Octal String: " + Integer.toOctalString(state));
    }
}