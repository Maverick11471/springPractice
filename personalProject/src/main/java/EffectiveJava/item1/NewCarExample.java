package EffectiveJava.item1;

public class NewCarExample {
    public static void main(String[] args) {

        NewCar newCar = new NewCar();

        int sum = newCar.sum(1, 2);
        int sum2 = newCar.sum(1, 2, 3);

        System.out.println(sum);
        System.out.println(sum2);

        int gas = 3;

        newCar.run(gas);

    }
}
