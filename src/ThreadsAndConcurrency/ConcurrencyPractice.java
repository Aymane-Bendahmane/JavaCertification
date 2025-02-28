package ThreadsAndConcurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrencyPractice {


    public static void main(String[] args) throws InterruptedException {
        List<String> list = new ArrayList<>();
        List<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>(list);

        Runnable runnable = () -> {
            String name = Thread.currentThread().getName();
            for (int i = 0; i < 10; i++) {
                copyOnWriteArrayList.add(name + ' ' +i);
            }
        };

        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(runnable);
            threads[i].start();
        }
        // Wait for all threads to finish
        for (int i = 0; i < 10; i++) {
            threads[i].join();
        }
        for (String s : copyOnWriteArrayList) {
            System.out.println(s);
        }
    }
}
