package EffectiveJava.item1;

public class Continue {

    public static void main(String[] args) {

        int[] arr;

        arr = new int[]{1, 2, 3};

        System.out.println(arr);

        String[] str;
        str = new String[] {"안녕"};
        System.out.println(str[0]);

        int[] str1 = {1, 2, 3};
        int[] str2 = new int[5];

        System.arraycopy(str1, 0, str2, 0, str1.length);

        for(int i = 0; i < str2.length; i++){
            System.out.println(str2[i]);
        }

        int[][] newArr = {
                {1, 2, 4},
                {2, 3}
        };

        for(int[] arr5 : newArr){
            for(int arr6 : arr5){
            System.out.print(arr6);
            }

            System.out.println();
        }

    }


}
