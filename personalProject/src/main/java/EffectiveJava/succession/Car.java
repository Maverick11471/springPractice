package EffectiveJava.succession;

public class Car {
    protected String tire;
    String handle;

    protected Car(String tire, String handle){
        this.tire = tire;
        this.handle = handle;
        System.out.println("부모생성자 출력");
    };

    protected void out(){
        System.out.println("프로텍티드");
    }


}

