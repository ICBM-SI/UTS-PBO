/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sewabajuprofesi;
import java.util.Scanner;
import model.BajuDokter;
import model.BajuProfesi;
import model.BajuPolisi;

public class SewaBajuProfesi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        BajuProfesi[] daftarBaju = {
            new BajuDokter("Seragam Dokter", 50000),
            new BajuPolisi("Seragam Polisi", 60000)
        };

        int pilihan;

        do {
            System.out.println("\n=== PENYEWAAN BAJU PROFESI ===");
            System.out.println("1. Lihat Daftar Baju");
            System.out.println("2. Sewa Baju");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            if (pilihan == 1) {
                System.out.println("\n=== DAFTAR BAJU ===");

                for (int i = 0; i < daftarBaju.length; i++) {
                    System.out.println("\nBaju ke-" + (i + 1));
                    daftarBaju[i].tampilkan();
                }

            } else if (pilihan == 2) {
                System.out.println("\n=== PILIH BAJU ===");

                for (int i = 0; i < daftarBaju.length; i++) {
                    System.out.println(
                        (i + 1) + ". " +
                        daftarBaju[i].nama +
                        " - Rp" +
                        daftarBaju[i].harga
                    );
                }

                System.out.print("Pilih nomor baju: ");
                int nomor = input.nextInt();
                if (nomor >= 1 && nomor <= daftarBaju.length) {

                    BajuProfesi baju = daftarBaju[nomor - 1];

                    System.out.print("Nama penyewa: ");
                    input.nextLine();
                    String namaPenyewa = input.nextLine();

                    System.out.print("Lama sewa (hari): ");
                    int lamaSewa = input.nextInt();

                    int total = baju.harga * lamaSewa;

                    System.out.println("\n=== STRUK PENYEWAAN ===");
                    System.out.println("Nama Penyewa : " + namaPenyewa);
                    System.out.println("Baju         : " + baju.nama);
                    System.out.println("Profesi      : " + baju.profesi);
                    System.out.println("Lama Sewa    : " + lamaSewa + " hari");
                    System.out.println("Total        : Rp" + total);
                } else {
                    System.out.println("Nomor baju tidak tersedia.");
                }

            } else if (pilihan == 3) {

                System.out.println("Terima kasih.");
            } else {
                System.out.println("Pilihan tidak tersedia.");
            }
        } while (pilihan != 3);
        input.close();
    }
}