package EffectiveJava.item1;

public class MemberService {
    String id = "hong";
    String password = "12345";

    public boolean login(String id, String password){

        if(this.id == id && this.password == password){
            return true;
        } return false;
    }

    public void logout(){
        System.out.println(this.id + "님이 로그아웃하셨습니다.");
    }


}
