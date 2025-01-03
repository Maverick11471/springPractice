package EffectiveJava.nested;

public class Tv {

    int volume;

    class Channel{
        static int volume;

        void go(){
            this.volume = 2;
            Tv.this.volume = 3;
        }

    }

    class Sbs extends Channel{
        static int b;


    }

    static class Kbs {

        void go(){
    // 변수는 기본이고, 클래스는 정적이라 접근 제한.
    //            volume = 2;
        }
    }

    void mbc(int c){

        int channel = 11;

        class Mbc{
            void shout(int c){
                System.out.println(channel);
                // 로컬 클래스는 매개변수와 변수가 final로 선언됨.
                //                channel = 2;
                c = 3;
            }
        }
    }
}
