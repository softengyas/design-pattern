package com.lambarki.singleton;

public class Singleton {
    // La variable statique qui contiendra l'unique instance de la classe
    private static Singleton instance;

    // Des variables d'instance pour démontrer l'utilisation de la classe
    private int count;

    // Le constructeur privé de la classe
    private Singleton() {
        // Initialiser les variables d'instance
        count = 0;
    }

    // La méthode statique qui renvoie l'unique instance de la classe
    public static Singleton getInstance() {
        // Vérifier si l'instance n'a pas encore été créée
        if (instance == null) {
            // Si ce n'est pas le cas, créer une nouvelle instance
            instance = new Singleton();
        }
        // Renvoyer l'unique instance de la classe
        return instance;
    }

    // Une méthode de la classe pour démontrer son utilisation
    public void incrementCount() {
        count++;
        System.out.println("Count is now " + count);
    }
}
