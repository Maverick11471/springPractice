package EffectiveJava.java_base.sec05;

public class ErrExample {
    public static void main(String[] args) {


        try{
            int value = Integer.parseInt("1oo");
        }catch(Exception e){
            System.err.println(e.getMessage());
            System.out.println(e.getMessage());
        }
    }
}
