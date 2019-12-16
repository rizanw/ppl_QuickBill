/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quickbill;

import DataBase.QuickBillData;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;

/**
 *
 * @author rzkan
 */
public class Kasir {
    String noIdKasir;
    String namaKasir;
    String kontakKasir;
    String alamatKasir;
    String emailKasir;
    String kataSandiKasir;
    
    public static DefaultListModel daftarKasir = new DefaultListModel();
    QuickBillData db = new QuickBillData();
    
    public boolean tambahDataKasir(String noId, String nama, String kontak, String alamat, String email, String kataSandi){
        boolean status = db.insertIntoKasir(noId, nama, kontak, alamat, email, kataSandi);
        
        if (!status) {
            System.out.println("gagal ditambahkan");
            return false;
        }

        new PesanKonfirmasi().penambahanDataKasirDilakukan();
        return true;
    }
    
    public ResultSet tampilkanDataKasir(String noId){
        ResultSet kasir = db.getDataKasir(noId);
        return kasir;
    }
    
    public void tampilkanDaftarDataKasir() throws SQLException {
        ResultSet rs = db.getAllDataKasir();
        
        while (rs.next()) {
            String data = rs.getString("NoIdKasir").concat(" | ").concat(rs.getString("namaKasir")).concat(" | ").concat(rs.getString("kontakKasir"));
            daftarKasir.addElement(data);
        }
    }
    
    public void hapusDataKasir(String noId) {
        
    }
    
    public void perbaruiDataKasir(String noId) {
        
    }
}
