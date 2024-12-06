package EffectiveJava.item1;

public class SumAverage {
    public static void main(String[] args) {

        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int studentSum = 0;
        int sum = 0;
        int average = 0;

        for(int i = 0; i < array.length; i++){
            studentSum += array[i].length;
            for(int j = 0; j < array[i].length; j++){
                sum += array[i][j];
            }
        }

        System.out.println("합: " + sum);
        System.out.println("평균: " + (double) sum / studentSum);

    }


}
