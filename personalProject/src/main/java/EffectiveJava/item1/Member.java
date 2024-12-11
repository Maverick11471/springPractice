package EffectiveJava.item1;

public class Member {
    String name;
    String id;
    String password;
    int age;

    Member(String name, String id){
        this.name = name;
        this.id = id;
    };

    public static void main(String[] args) {
        Member user1 = new Member("홍길동", "hong");
    }
}
