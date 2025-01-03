package EffectiveJava.threadPool;

public class Setname {

    public static void main(String[] args) {

        Thread thread1 = Thread.currentThread();
        System.out.println(thread1.getName());

        Thread thread = new Thread(){
            @Override
            public void run(){
                System.out.println(getName());
            }
        };


        thread.start();
    }



}
