package EffectiveJava.anonymous;

public class Test {

    static int count;
    final int count2 = 1;
    static final int count3 = 4;

    public static void main(String[] args) {
        Test.count = 1;

        System.out.println(Test.count);
        Test.count = 2;

        System.out.println(Test.count);

        Test test = new Test();
        System.out.println(test.count2);

        System.out.println(Test.count3);
    }
}
