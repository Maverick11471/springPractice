package EffectiveJava.item1;

public class Println {
    public static void println(int a){
        System.out.println(a);
    }

    public static void println(boolean b){
        System.out.println(b);
    }

    public static void main(String[] args) {
        Println.println(1);
        Println.println(true);
    }
}
