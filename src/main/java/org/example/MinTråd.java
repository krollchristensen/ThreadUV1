package org.example;

// Oprettelse af en tråd ved at implementere Runnable
//Her udskriver tråden fem beskeder med ét sekunds pause mellem hver.
class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Tråd kører: " + i);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {

            }
        }
    }
}