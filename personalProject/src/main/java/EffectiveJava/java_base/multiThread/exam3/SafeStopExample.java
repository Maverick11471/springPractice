package EffectiveJava.java_base.multiThread.exam3;

public class SafeStopExample {

    public static void main(String[] args) {

    PrintThread printThread = new PrintThread();
        printThread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        printThread.setStop(true);


    }
}
