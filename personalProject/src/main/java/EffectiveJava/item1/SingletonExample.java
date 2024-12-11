package EffectiveJava.item1;

public class SingletonExample {
    public static void main(String[] args) {


//    Singleton st1 = new Singleton();

        Singleton st1 = Singleton.getInstance();
        Singleton st2 = Singleton.getInstance();

        if(st1 == st2){
            System.out.println("같은 객체입니다.");
        }
    }
}
