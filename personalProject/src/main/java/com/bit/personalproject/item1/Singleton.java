package com.bit.personalproject.item1;

public class Singleton {

    private static final Singleton instance = new Singleton();

    private Singleton(){
        System.out.println("Singleton instance created.");
    }

    public static Singleton getInstance(){
        return instance;
    }

    public void performAction() {
        System.out.println("Action performed by singleton instance.");
    }

}
