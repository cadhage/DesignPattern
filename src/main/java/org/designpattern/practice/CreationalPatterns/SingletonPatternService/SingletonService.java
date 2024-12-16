package org.designpattern.practice.CreationalPatterns.SingletonPatternService;

class Singleton {
    private static Singleton instance;

    private Singleton() {
        // private constructor to restrict instantiation
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton instance method called");
    }
}
