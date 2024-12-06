package EffectiveJava.item1;

import java.util.Scanner;

public class Dice {

    public static void main(String[] args) {
        int dice = (int)(Math.random() * 6) + 1;

        switch(dice){
            case 1 -> System.out.println("1입니다.");
            case 2 -> System.out.println("2입니다.");
            case 3 -> System.out.println("3입니다.");
            case 4 -> {
                System.out.println("4입니다.");
            }
            case 5 -> {
                System.out.println("5입니다.");
            }
            default -> System.out.println("6입니다.");
        }

        String grade = "B";

        int score = switch (grade){
            case "A" -> 100;
            case "B" -> {
                int result = 100 - 20;
                yield result;
            }
            default -> 60;
        };

        System.out.println(score);

        Scanner scanner = new Scanner(System.in);

        int speed = 0;
        boolean race = true;

        while(race){
            System.out.println("선택하세요.");
            System.out.println("1. 증가 | 2. 감소 | 3. 중지");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> speed++;
                case "2" -> speed--;
                default -> race = false;
            }
            System.out.println("현재 속도: " + speed);
        }

        scanner.close();
    }




}
