package org.example.join;

public class ThreadJoinDemo {
    public static void main(String[] args) {
        Thread t1 = new Worker("Tråd 1");
        Thread t2 = new Worker("Tråd 2");

        t1.start();

//        try {
                //t1.join(); sikrer, at main venter på t1, før den fortsætter.
//            t1.join();
//
//        } catch (InterruptedException e) { }
        //t2.start(); starter først, når t1 er færdig.
        t2.start();



        System.out.println("Main slut");
    }
}