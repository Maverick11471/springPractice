package EffectiveJava.reflection;

public class Service {

    @PrintAnnotaition
    public void method1(){
        System.out.println("1");
    }

    @PrintAnnotaition("*")
    public void method2(){
        System.out.println("2");
    }

    @PrintAnnotaition(value = "+", number = 20)
    public void method3(){
        System.out.println("3");
    }

}
