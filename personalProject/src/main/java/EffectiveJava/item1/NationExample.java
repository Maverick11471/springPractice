package EffectiveJava.item1;

public class NationExample {
    public static void main(String[] args) {
        Nation nation = new Nation("123-123-123", "홍길동");

        System.out.println(nation.nation);
        System.out.println(nation.ssn);
        System.out.println(nation.name);

//        nation.nation = "america";
//        nation.ssn = "456";
        nation.name = "임꺽정";
    }
}
