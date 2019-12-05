/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quickbill;

/**
 *
 * @author rzkan
 */
public class DaftarDataKasir {
    String noIdKasir;
    String namaKasir;
    String kontakKasir;
    String alamatKasir;
    String emailKasir;
    String kataSandiKasir;
    DBConnection db = new DBConnection();
    
    public boolean tambahDataKasir(String noId, String nama, String kontak, String alamat, String email, String kataSandi){
        boolean status = db.insertIntoKasir(noId, nama, kontak, alamat, email, kataSandi);
        
        if (!status) {
            System.out.println("gagal ditambahkan");
            return false;
        }

        new PesanKonfirmasi().penambahanDataKasirDilakukan();
        return true;
    }
}
