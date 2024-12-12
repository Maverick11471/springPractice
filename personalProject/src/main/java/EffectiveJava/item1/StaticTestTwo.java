package EffectiveJava.item1;

public class StaticTestTwo {

    static int v1;
    static final int v2;
    final int v3;

    StaticTestTwo(int v3){
      this.v3 = v3;
    }

    static {
        v2 = 3;
    }

    public static void main(String[] args) {
        int a = StaticTestTwo.v1;
        int b = StaticTestTwo.v2;

        System.out.println(a);
        System.out.println(b);

        StaticTestTwo.v1 = 3;
//        StaticTestTwo.v2 = 4;

        StaticTestTwo staticTestTwo = new StaticTestTwo(2);
        System.out.println(staticTestTwo.v3);

//        staticTestTwo.v3 = 6;

        System.out.println(StaticTestTwo.v1);
        System.out.println(StaticTestTwo.v2);
    }
}
