package EffectiveJava.item1;

import java.util.Scanner;

public class Chatting {

    public static void main(String[] args) {
        System.out.println("메시지를 입력하세요.");
        System.out.println("q를 입력하면 종료됩니다.");

        Scanner scanner = new Scanner(System.in);

        String inputStream;

        do{
            System.out.print(">");
            inputStream = scanner.nextLine();
            System.out.println(inputStream);
        }while (!inputStream.equals("q"));


    }
}
