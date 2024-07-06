package com.example.behavioural.chainofresponsibility;


abstract class Handler {
    protected Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(String request);
}

class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("Request1")) {
            System.out.println("ConcreteHandler1 handled " + request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}

class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("Request2")) {
            System.out.println("ConcreteHandler2 handled " + request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}

public class ChainOfResponsibilityPatternDemo {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setNextHandler(handler2);

        handler1.handleRequest("Request1");
        handler1.handleRequest("Request2");
        handler1.handleRequest("UnknownRequest");
    }
}
