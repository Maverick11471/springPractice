package EffectiveJava.java_base.multiThread.exam6;

import java.util.concurrent.*;

public class CallableSubmitExample {
    public static void main(String[] args) {
// dd
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for(int i = 1 ; i <= 100; i++){
            final int idx = i;
            Future<Integer> future = executorService.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    int sum = 0;
                    for(int i = 1 ; i<=idx ; i++){
                        sum += i;
                    }
                    Thread thread = Thread.currentThread();
                    System.out.println("[" + thread.getName() + "] 1~" +
                            idx + "합 계산");
                    return sum;
                }
            });

            try {
                int result = future.get();
                System.out.println("\t리턴값: " + result);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }

        executorService.shutdown();
    }

}
