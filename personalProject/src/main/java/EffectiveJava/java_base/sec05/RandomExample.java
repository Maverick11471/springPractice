package EffectiveJava.java_base.sec05;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {


    Random random = new Random(3);
    int value = random.nextInt(45)+1;

    Random random1 = new Random(3);
    int value1 = random1.nextInt(45)+1;

        System.out.println(value);
        System.out.println(value1);
    }
}
