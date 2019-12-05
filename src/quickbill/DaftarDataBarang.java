/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quickbill;

/**
 *
 * @author rizkyandre
 */
public class DaftarDataBarang {

    String noIdentitasBarang;
    String namaBarang;
    int hargaBarang;
    int jumlahBarangTersedia;
    DBConnection db = new DBConnection();

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
