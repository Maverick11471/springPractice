package EffectiveJava.java_base.multiThread.exam2;

public class ThreadB extends Thread{
    WorkObject workObject;

    public ThreadB(WorkObject workObject){
        setName("ThreadB");
        this.workObject = workObject;
    }

    @Override
    public void run(){
        for(int i = 0 ; i < 10; i ++)
        workObject.methodB();
    }
}
