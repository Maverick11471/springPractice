package EffectiveJava.succession;

public class SmartPhone extends Phone{

    int a;

    SmartPhone(int a){
        super(a);
        this.a = a;
        System.out.println("오류가 나나요?");
    }

    public static void out(){
        System.out.println("생성자 오류?");
    }

    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone(1);

        smartPhone.out();
    }
}
