package EffectiveJava.nestedClass;

public class C {
    class D{
        int field1 = 1;
        static int field2 = 2;

        D(){
            System.out.println("D-생성자 실행");
        }

        void method1(){
            System.out.println("D-메서드1 실행");
        }
        static void method2(){
            System.out.println("D-메서드2 실행");
        }
    }

    void useB(){
        D d = new D();
        System.out.println(d.field1);
        System.out.println(D.field2);

        d.method1();
        D.method2();
    }
}
