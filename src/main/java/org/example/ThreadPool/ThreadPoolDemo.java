package org.example.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(50);

        for (int i = 1; i <= 100; i++) {
            executor.execute(new Opgave(i));
        }

        executor.shutdown();
    }
}
