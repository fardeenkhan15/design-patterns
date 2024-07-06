package com.example.structural.adapter;


// Existing class
class Adaptee {
    public void specificRequest() {
        System.out.println("Called specificRequest()");
    }
}

// Target interface
interface Target {
    void request();
}

// Adapter class
class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}

// Client code
public class AdapterPatternDemo {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request();
    }
}
