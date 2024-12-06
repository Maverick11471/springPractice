package EffectiveJava.item1;

import java.util.Scanner;

public class ScannerAverage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int studentNum = 0;
        int[] scoreArr = null;

        while (true) {
            System.out.println("-----------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("-----------------------");

            String choice = scanner.nextLine();
            System.out.println("선택> " + choice);

            switch (choice){
                case "1":
                    System.out.println("학생수를 입력하세요.");
                    studentNum = Integer.parseInt(scanner.nextLine());
                    System.out.println("학생수>" + studentNum);
                    scoreArr = new int[studentNum];
                    continue;
                case "2":
                    for(int i = 0; i < scoreArr.length; i++){
                        System.out.print((i + 1) + "번째 학생의 점수: ");
                        scoreArr[i] = Integer.parseInt(scanner.nextLine());
                    }
                    continue;
                case "3":
                    System.out.print("학생들 점수: ");
                    for(int i = 0; i < scoreArr.length - 1; i++){
                        System.out.print(scoreArr[i] + ", ");
                    }
                    System.out.println(scoreArr[scoreArr.length - 1]);
                    continue;
                case "4":
                    int maxScore = scoreArr[0];
                    for(int score : scoreArr){
                        if(maxScore < score){
                            maxScore = score;
                        }
                    }
                    System.out.println("최고점수: " + maxScore);

                    double aveageScore = (double) maxScore / studentNum;
                    System.out.println("평균 점수: " + aveageScore);
                    continue;
                case "5":
                    System.out.println("종료하였습니다.");
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
                    continue;
            }
            break;
        }

    }
}
