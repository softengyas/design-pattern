package com.lambarki.singleton;

public class DemoSingleton {

    public static void main(String[] args) {
        // Récupérer l'unique instance de la classe Singleton
        Singleton singleton = Singleton.getInstance();

        // Appeler une méthode de la classe Singleton
        singleton.incrementCount();

        // Récupérer à nouveau l'unique instance de la classe Singleton
        Singleton singleton2 = Singleton.getInstance();

        // Vérifier que singleton et singleton2 sont la même instance de la classe
        if (singleton == singleton2) {
            System.out.println("singleton and singleton2 are the same instance");
        } else {
            System.out.println("singleton and singleton2 are different instances");
        }
    }
}
