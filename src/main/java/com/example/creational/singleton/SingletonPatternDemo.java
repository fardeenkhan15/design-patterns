package com.example.creational.singleton;

class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

public class SingletonPatternDemo {
    public static void main(String[] args) {
        Singleton single = Singleton.getInstance();
        single.showMessage();
    }
}
