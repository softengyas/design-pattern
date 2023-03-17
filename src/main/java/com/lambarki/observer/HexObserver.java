package com.lambarki.observer;

class HexObserver implements Observer {
    @Override
    public void update(int state) {
        System.out.println("Hex String: " + Integer.toHexString(state));
    }
}