package com.radhsyn83;

/*
 *
 * Fathur Radhy
 * 10115046
 * PDO11K
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner s = new Scanner(System.in);
        int ambil;

        System.out.println("======Program Penarikan Uang======");
        System.out.print("Masukkan Saldo Awal : ");
        Tabungan t = new Tabungan(s.nextInt());
        System.out.print("Jumlah uang yang diambil : ");
        ambil = s.nextInt();
        System.out.print("Saldo anda sekarang : " + t.ambilUang(ambil));

    }
}
