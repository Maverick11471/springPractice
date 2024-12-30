package EffectiveJava.rambda;

public class MethodReferenceExample {
    public static void main(String[] args) {

    Person person = new Person();

    person.ordering(String :: compareToIgnoreCase);
    }
    //테스트
}
