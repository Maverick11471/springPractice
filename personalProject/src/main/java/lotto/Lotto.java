package lotto;

import java.util.Arrays;
import java.util.Random;

public class Lotto {



    public static void main(String[] args) {
        Random random = new Random();

        Class clazz = random.getClass();
        System.out.println(clazz.getSimpleName());

        int[][] selectNum = new int[5][6];

        for(int j = 0; j < 5; j++){

            for(int i = 0; i < selectNum[j].length ; i++){
                selectNum[j][i] = random.nextInt(45) + 1;

            }

            Arrays.sort(selectNum[j]);
            for(int num : selectNum[j]){
                System.out.print(num + " ");

            }

            System.out.println();
        }






    }
}
