package ThreadsAndConcurrency;

public class ThreadsPractice {
    public static void main(String[] args) {

        Runnable runnable = ()-> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + " " + i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

        t1.start();
        t2.start();

    }
}
