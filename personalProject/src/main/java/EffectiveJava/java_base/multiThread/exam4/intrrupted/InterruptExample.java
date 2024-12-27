package EffectiveJava.java_base.multiThread.exam4.intrrupted;

import EffectiveJava.java_base.multiThread.exam4.PrintThread;

public class InterruptExample {
    public static void main(String[] args) {
        Thread thread = new PrintThread();
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        thread.interrupt();
    }
}
