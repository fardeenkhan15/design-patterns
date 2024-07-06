package com.example.structural.proxy;

interface Subject {
    void request();
}

class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("RealSubject request");
    }
}

class Proxy implements Subject {
    private RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.request();
    }
}
