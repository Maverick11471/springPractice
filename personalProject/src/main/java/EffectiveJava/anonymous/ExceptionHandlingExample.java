package EffectiveJava.anonymous;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String");
            System.out.println("존재");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Class.forName("java.lang.String2");
            System.out.println("존재");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
