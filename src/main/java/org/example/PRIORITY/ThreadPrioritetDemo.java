package org.example.PRIORITY;

public class ThreadPrioritetDemo {
    public static void main(String[] args) {
        Thread t1 = new MyThread("Lav", Thread.MIN_PRIORITY);
        Thread t2 = new MyThread("Normal", Thread.NORM_PRIORITY);
        Thread t3 = new MyThread("Høj", Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
