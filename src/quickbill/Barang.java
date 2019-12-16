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
 * @author rizkyandre
 */
public class Barang {

    public static String NoIdBarang;
    public static String namaBarang;
    public static int hargaBarang;
    public static int jumlahBarangTersedia;
    public static DefaultListModel daftarBarang = new DefaultListModel();
    
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

    public void tampilkanDataBarang(String noBarang) throws SQLException {
        ResultSet rs = db.getDataBarang(noBarang);

        while (rs.next()) {
            NoIdBarang = rs.getString("NoIdBarang");
            namaBarang = rs.getString("namaBarang");
            hargaBarang = rs.getInt("hargaBarang");
            jumlahBarangTersedia = rs.getInt("jumlahBarangTersedia");
        }

        System.out.printf(
                "%s %s %d %d\n",
                NoIdBarang, namaBarang,
                hargaBarang, jumlahBarangTersedia
        );

        new WindowDataBarang().setVisible(true);
    }

    public void tampilkanDaftarDataBarang() throws SQLException {
        ResultSet rs = db.getAllDataBarang();
        
        while (rs.next()) {
            String data = rs.getString("NoIdBarang").concat(" | ").concat(rs.getString("namaBarang")).concat(" | ").concat(String.valueOf(rs.getInt("hargaBarang"))).concat(" | ").concat(String.valueOf(rs.getInt("jumlahBarangTersedia")));
            daftarBarang.addElement(data);
        } 
    }
}
