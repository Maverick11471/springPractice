package EffectiveJava.item1;

public class DiceWhile {
    public static void main(String[] args) {

        while(true){
            int dice = (int)(Math.random()*6) + 1;
            System.out.println(dice);

            if(dice == 6){
                break;
            }
        }

        System.out.println("실행이 종료됩니다.");
    }
}
