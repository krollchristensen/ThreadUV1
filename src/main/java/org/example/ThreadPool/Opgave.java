package org.example.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Opgave implements Runnable {
    private int id;
    public Opgave(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Opgave " + id + " kører i tråd: " + Thread.currentThread().getName());
        try {
            Thread.sleep(200);
        }
        catch (InterruptedException e)
        { }
    }
}
