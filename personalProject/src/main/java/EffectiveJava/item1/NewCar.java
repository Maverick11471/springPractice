package EffectiveJava.item1;

public class NewCar {

    String model;
    String color;
    int maxSpeed;
    int gas;
    static int boom = 10;

    NewCar(){

    }

    NewCar(String model, String color, int maxSpeed){
            this.model = model;
            this.color = color;
            this.maxSpeed = maxSpeed;
    }

    int sum(int ... values){
        int sum = 0;

        for(int value : values){
            sum += value;
        }

        return sum;
    }

    void run(int gas){
        this.gas = gas;
        while(true){
            if(gas > 0){
                System.out.println("잔역 가스량: " + gas);
                gas -= 1;
            }
            else{
                System.out.println("gas가 소진됐습니다.");
                return;
            }
        }
    }
}
