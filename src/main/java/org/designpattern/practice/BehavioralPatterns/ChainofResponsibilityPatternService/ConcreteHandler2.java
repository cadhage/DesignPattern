package org.designpattern.practice.BehavioralPatterns.ChainofResponsibilityPatternService;

interface Handler {
    void setNextHandler(Handler nextHandler);
    void handleRequest(String request);
}

class ConcreteHandler1 implements Handler {
    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest(String request) {
        if (request.equals("Handler1")) {
            System.out.println("ConcreteHandler1 handled the request");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}

class ConcreteHandler2 implements Handler {
    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest(String request) {
        if (request.equals("Handler2")) {
            System.out.println("ConcreteHandler2 handled the request");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
