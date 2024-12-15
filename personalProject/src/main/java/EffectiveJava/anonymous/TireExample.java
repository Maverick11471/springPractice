package EffectiveJava.anonymous;

public class TireExample {


        static Tire tire1 = new Tire();

        static Tire tire2 = new Tire(){
            @Override
            public void run(){
                System.out.println("필드입니다.");
            }
        };

        static public void run2(){
            Tire tire = new Tire(){
                @Override
                public void run(){
                    System.out.println("메소드입니다.");
                }
            };
        };

        static public void run1(){
            tire1.run();
            tire2.run();
        }

        static public void run3(Tire tire){
            System.out.println("매개변수 입니다.");
        }

    public static void main(String[] args) {



            TireExample tireExample = new TireExample();

            tireExample.run1();
            tireExample.run2();

            tireExample.run3(new Tire(){
               @Override
               public void run(){
                   System.out.println("매개변수입니다.");
               }
            });



    }
}
