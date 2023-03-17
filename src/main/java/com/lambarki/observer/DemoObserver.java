package com.lambarki.observer;

public class DemoObserver {
    public static void main(String[] args) {
        Subject subject = new Subject();

        BinaryObserver binaryObserver = new BinaryObserver();
        OctalObserver octalObserver = new OctalObserver();
        HexObserver hexObserver = new HexObserver();

        subject.attach(binaryObserver);
        subject.attach(octalObserver);
        subject.attach(hexObserver);

        System.out.println("First state change: 15");
        subject.setState(15);

        System.out.println("\nSecond state change: 10");
        subject.setState(10);
    }
}

