package EffectiveJava.item1;

public class MemberExample {
    public static void main(String[] args) {

        MemberService memberService = new MemberService();

        boolean result = memberService.login("hong", "12345");
        if(result){
            System.out.println("로그인 하였습니다.");
            memberService.logout();
        } else {
            System.out.println("id 또는 password가 올바르지 않습니다.");
        }
    }
}
