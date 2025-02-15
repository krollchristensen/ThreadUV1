package org.example.synkronisering;

public class RaceConditionDemo {
    public static void main(String[] args) throws InterruptedException {
        BankKonto konto = new BankKonto();
        Runnable indsaetter = () -> { for (int i = 0; i < 10000; i++) konto.indsaet(10); };
        Thread t1 = new Thread(indsaetter);
        Thread t2 = new Thread(indsaetter);
        t1.start(); t2.start(); t1.join(); t2.join();
        System.out.println("Slutsaldo: " + konto.getSaldo());
    }
}
