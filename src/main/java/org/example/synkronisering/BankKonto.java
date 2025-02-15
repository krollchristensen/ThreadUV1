package org.example.synkronisering;

class BankKonto {
    private int saldo = 0;
    public synchronized void indsaet(int beloeb) {

        saldo += beloeb;
    }
    public int getSaldo() { return saldo; }
}
