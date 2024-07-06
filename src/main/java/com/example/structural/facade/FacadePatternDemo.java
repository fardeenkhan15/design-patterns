package com.example.structural.facade;

class SubSystemOne {
    public void methodOne() {
        System.out.println("SubSystemOne methodOne");
    }
}

class SubSystemTwo {
    public void methodTwo() {
        System.out.println("SubSystemTwo methodTwo");
    }
}

class Facade {
    private SubSystemOne one;
    private SubSystemTwo two;

    public Facade() {
        one = new SubSystemOne();
        two = new SubSystemTwo();
    }

    public void methodA() {
        one.methodOne();
        two.methodTwo();
    }

    public void methodB() {
        two.methodTwo();
    }
}

public class FacadePatternDemo {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }
}
