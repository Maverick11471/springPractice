package EffectiveJava.java_base.multiThread.exam1;

public class Calculator {
    private int memory;

    public int getMemory(){
        return this.memory;
    }

    public synchronized void setMemory1(int memory){
        this.memory = memory;

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + ": " + this.memory);
    }

    public void setMemory2(int memory){
        synchronized (this){
        this.memory = memory;

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + ": " + this.memory);
        }
    }
}
