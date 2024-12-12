package EffectiveJava.item2;

import EffectiveJava.succession.Car;

public class SuperCar extends Car {

    public SuperCar(String tire, String handle){
        super(tire, handle);
    }

    public void out1(){
        this.tire = "핸들";
        this.out();
    }

    @Override
    public void out(){

    }

    public static void main(String[] args) {

    }

//    public void out2(){
//        Car car = new Car(String tire, String handle);
//        car.handle;
//        car.tire;
//    }

}
