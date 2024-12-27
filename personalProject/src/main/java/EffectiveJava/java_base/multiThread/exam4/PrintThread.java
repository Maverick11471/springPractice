package EffectiveJava.java_base.multiThread.exam4;

public class PrintThread extends Thread{
    @Override
    public void run(){
        try {
            while(true){
                System.out.println("실행중");
                Thread.sleep(1);
            }
        } catch (InterruptedException e) {

        }
    }
}
