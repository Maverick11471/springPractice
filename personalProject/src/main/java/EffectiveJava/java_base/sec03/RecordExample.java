package EffectiveJava.java_base.sec03;

public class RecordExample {


    public static void main(String[] args) {
        Member member = new Member("winter", "눈송이", 25);

        System.out.println(member.id());
        System.out.println(member.name());
        System.out.println(member.age());
        System.out.println(member);

        System.out.println();

        Member m1 = new Member("winter", "눈송이", 25);
        Member m2 = new Member("winter", "눈송이", 25);
        System.out.println(m1.equals(m2));
        System.out.println(m1.hashCode() == m2.hashCode());
    }

}
