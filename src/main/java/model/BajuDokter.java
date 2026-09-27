/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
public class BajuDokter extends BajuProfesi {

    public BajuDokter(String nama, int harga) {
        super(nama, "Dokter", harga);
    }

    @Override
    public void tampilkan() {
        System.out.println("Jenis     : Baju Dokter");
        super.tampilkan();
    }
}
