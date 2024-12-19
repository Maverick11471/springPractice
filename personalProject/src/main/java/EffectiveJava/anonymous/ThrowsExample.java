package EffectiveJava.anonymous;

import java.io.FileInputStream;

public class ThrowsExample {

    public static void main(String[] args) {
        try {
            findClass();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }




    public static void findClass() throws ClassNotFoundException{

    }
}
