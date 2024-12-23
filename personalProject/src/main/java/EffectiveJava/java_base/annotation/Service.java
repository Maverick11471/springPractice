package EffectiveJava.java_base.annotation;

public class Service {
    @PrintAnntation
    public void method1(){
        System.out.println("실행 내용1");
    }

    @PrintAnntation("*")
    public void method2(){
        System.out.println("실행 내용2");
    }

    @PrintAnntation(value="#", number=20)
    public void method3(){
        System.out.println("실행 내용3");
    }
}
