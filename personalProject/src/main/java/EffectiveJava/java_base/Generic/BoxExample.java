package EffectiveJava.java_base.Generic;

public class BoxExample {


    public static void main(String[] args) throws Exception{
        Box<String> box = new Box<>("안녕");
        System.out.println(box.get());
        box.set("즐");
        System.out.println(box.get());
    }

}
