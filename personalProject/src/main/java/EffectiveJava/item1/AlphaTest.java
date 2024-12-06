package EffectiveJava.item1;

public class AlphaTest {
    public static void main(String[] args) throws Exception{

        Outter: for(char upper = 'A'; upper <= 'Z'; upper++){
        for(char lower = 'a'; lower <= 'z' ; lower++){
            System.out.println(upper + "-" + lower);
            if(lower == 'g'){
                break Outter;
            }
        }
        }

        System.out.println("실행이 종료됩ㄴ디ㅏ.");

    }
}
