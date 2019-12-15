/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quickbill;

import DataBase.QuickBillData;

/**
 *
 * @author rizkyandre
 */
public class Barang {

    String noIdentitasBarang;
    String namaBarang;
    int hargaBarang;
    int jumlahBarangTersedia;
    QuickBillData db = new QuickBillData();

    public boolean tambahDataBarang(String NoIdBarang, String namaBarang, int hargaBarang, int jumlahBarangTersedia) {
        boolean status = db.insertIntoBarang(NoIdBarang, namaBarang, hargaBarang, jumlahBarangTersedia);

        if (!status) {
            System.out.println("gagal ditambahkan");
            return false;
        }

        new PesanKonfirmasi().penambahanDataBarangDilakukan();
        return true;
    }

}
