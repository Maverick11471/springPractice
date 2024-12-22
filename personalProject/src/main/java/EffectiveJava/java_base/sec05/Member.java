package EffectiveJava.java_base.sec05;

public class Member {
    String name;

    Member(){

    }

    Member(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        String name = "안녕";
        String name2 = "안녕";
        Member member1 = new Member(name);
        Member member2 = new Member(name);

        System.out.println(name == name2);
        System.out.println(member1);
//        System.out.println(member2);
        System.out.println(member1.hashCode());
//        System.out.println(member2.hashCode());
//        System.out.println(member1.equals(member2));
    }
}
