package EffectiveJava.java_base.multiThread;

import org.springframework.data.relational.core.sql.In;

public class YieldExample {
    public static void main(String[] args) {
        WorkThread workThreadA = new WorkThread("1번");
        WorkThread workThreadB = new WorkThread("2번");

        workThreadA.start();
        workThreadB.start();

        try{
            Thread.sleep(5000);
        } catch (InterruptedException e){}
        workThreadA.work = false;

        try{
            Thread.sleep(10000);
        } catch (InterruptedException e){}
        workThreadA.work = true;
    }
}
