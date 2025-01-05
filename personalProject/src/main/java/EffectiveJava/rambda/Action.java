package EffectiveJava.rambda;

import java.util.List;

public class Action {

    public static void main(String[] args) {
        action(ActionTwo :: plus);
        ActionTwo actionTwo = new ActionTwo();
        action(actionTwo :: minus);

        List<Integer> numbers;
//        numbers.sort();
        String a = "홍길동";
        String b = "b";

        a.compareToIgnoreCase(b);

    }

    public static void action(Calculable calculable){
        int c = calculable.calc(1, 3);
        System.out.println(c);
    }


}
