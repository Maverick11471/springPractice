package EffectiveJava.abstractP;

public class Child extends Parent{

    void run(){
        System.out.println("뻑");
    }

    public static void main(String[] args) {

        Parent parent = new Child();

        parent.run();

    }

}
