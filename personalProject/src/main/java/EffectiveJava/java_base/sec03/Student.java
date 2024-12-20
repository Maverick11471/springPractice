package EffectiveJava.java_base.sec03;

public class Student {
    private int no;
    private String name;

    Student(int no, String name){
        this.no = no;
        this.name = name;
    }

    @Override
    public int hashCode(){
        int hashCode = no + name.hashCode();
        return hashCode;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Student target){
            if(no == target.no && name.equals(target.name)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "홍길동");
        Student student2 = new Student(1, "홍길동");

        boolean equals = student1.equals(student2);
        boolean equals2 = (student1.hashCode() == student2.hashCode());

        System.out.println(equals);
        System.out.println(equals2);
    }
}
