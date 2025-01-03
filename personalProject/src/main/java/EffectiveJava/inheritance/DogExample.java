package EffectiveJava.inheritance;

public class DogExample {
    public static void main(String[] args) {
        Animal animal = new Dog();
// 부모 타입이기 때문에 자식 타입의 메소드를 사용할 수 없음.
//        animal.run();
    }
}
