package EffectiveJava.succession;

public class SportsCar extends Car{
    public SportsCar(String tire, String handle){
        super(tire, handle);
        System.out.println("자식생성자 출력");
    };
}
