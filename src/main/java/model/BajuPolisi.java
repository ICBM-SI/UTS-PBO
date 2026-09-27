/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
public class BajuPolisi extends BajuProfesi {

    public BajuPolisi(String nama, int harga) {
        super(nama, "Polisi", harga);
    }

    @Override
    public void tampilkan() {
        System.out.println("Jenis     : Baju Polisi");
        super.tampilkan();
    }
}
