package com.radhsyn83;

public class Tabungan {
    private int saldo;

    public Tabungan(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public int ambilUang(int jumlah) {
        return saldo - jumlah;
    }
}
