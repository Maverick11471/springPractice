package EffectiveJava.anonymous;

public class ExceptionHandlingExample2 {

    public static void printLength(String data){

            int result = data.length();
            System.out.println("문자수:" + result);

    }

    public static void main(String[] args) throws Exception{
        printLength("안녕");
        printLength(null);
    }




}
