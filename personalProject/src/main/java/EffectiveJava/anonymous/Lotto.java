package EffectiveJava.anonymous;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.Stream;

public class Lotto {
    public static void main(String[] args) {
        Random random = new Random();


        for(int i = 0 ; i < 5 ; i++){
            Set<Integer> set = new HashSet<>();

            while (set.size()<6){
                int a = random.nextInt(45) + 1;
                set.add(a);
            }

            Integer[] integers = set.toArray(new Integer[0]);

            Arrays.sort(integers);

            Arrays.stream(integers)
                    .forEach(n -> System.out.print(n + " "));
            System.out.println();
        }

    }
}
