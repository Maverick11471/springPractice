package EffectiveJava.anonymous;

public class MyResource implements AutoCloseable{

    String title;

    MyResource(String title){
        this.title = title;
    }

    public void open(){
        System.out.println(this.title + "파일을 엽니다.");
    }

    @Override
    public void close() throws Exception {
        System.out.println(this.title + "파일을 닫습니다.");
    }
}
