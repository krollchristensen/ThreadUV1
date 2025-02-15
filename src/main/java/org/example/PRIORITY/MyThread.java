package org.example.PRIORITY;

class MyThread extends Thread {
    private String navn;

    public MyThread(String navn, int prioritet) {
        this.navn = navn;
        setPriority(prioritet);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(navn + ": " + i);
        }
    }
}
