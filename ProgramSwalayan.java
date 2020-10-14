package com.usu.pbo;

import java.util.Scanner;

public class ProgramSwalayan {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Double totalPembelian, totalPembayaran;
        int jenisPembayaran;

        System.out.print("Masukkan Total Pembelian Anda = ");
        totalPembelian = input.nextDouble();

        System.out.println("Jenis Member Anda:");
        System.out.println("1. VIP");
        System.out.println("2. Reguler");
        System.out.print("Input: ");
        jenisPembayaran = input.nextInt();

        if (totalPembelian > 1_000_000) {
            totalPembayaran = totalPembelian - (totalPembelian * 0.1);
        } else if (totalPembelian >= 500_000 && totalPembelian <= 1_000_000) {
            totalPembayaran = totalPembelian - (totalPembelian * 0.05);
        } else if (totalPembelian >= 100_000 && totalPembelian < 500_000) {
            totalPembayaran = totalPembelian - (totalPembelian * 0.025);
        } else {
            totalPembayaran = totalPembelian;
        }

        switch (jenisPembayaran) {
            case 1 :
                if (totalPembelian > 50_000) totalPembayaran = totalPembayaran - (totalPembelian * 0.01);
                break;
            case 2 :
                if (totalPembelian > 100_000) totalPembayaran = totalPembayaran - (totalPembelian * 0.01);
                break;
        }

        System.out.println("Total pembayaran Anda: Rp" + totalPembayaran);
    }
}


