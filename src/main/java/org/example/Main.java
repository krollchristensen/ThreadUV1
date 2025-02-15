package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Thread t1 = new Thread(new MyThread());
        t1.start();
    }
}