package org.example.join;

class Worker extends Thread {
    private String navn;

    public Worker(String navn) {
        this.navn = navn;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(navn + " arbejder: " + i);
            try { Thread.sleep(1000); } catch (InterruptedException e) { }
        }
    }
}