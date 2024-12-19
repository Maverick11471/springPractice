package EffectiveJava.anonymous;

public class MyResourceExample {
    public static void main(String[] args) {

        MyResource mr1 = new MyResource("A");
        mr1.open();

//        try(MyResource mr1 = new MyResource("A")){
//            mr1.open();
//        } catch(Exception e){
//            System.out.println(e.getMessage());
//        }
//
//        try (MyResource mr2 = new MyResource("B")){
//            mr2.open();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

    }
}
