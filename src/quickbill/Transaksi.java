/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quickbill;

import DataBase.QuickBillData;
import java.sql.ResultSet;
import java.sql.Date;
import java.sql.SQLException;

/**
 *
 * @author rzkan
 */
public class Transaksi {
    public static String nomorTransaksi;
    public static String namaPelanggan;
    public static int jumlahNominal;
    public static Date tanggalTransaksi;
    QuickBillData db = new QuickBillData();
    
    public boolean tambahDataTransaksi(String nomorTransaksi, String namaPelanggan, int jumlahNominal, Date tanggalTransaksi) {
        
        boolean status = db.insertIntoTransaksi(nomorTransaksi, namaPelanggan, jumlahNominal, tanggalTransaksi);
        
        if (!status) {
            new PesanKonfirmasi().peringatanGagalTransaksi();
            System.out.println("gagal ditambahkan");
            return false;
        }

        System.out.println("berhasil ditambahkan");
        return true;
    }
    
    public void hapusDataTransaksi() {
        
    } 
    
    public void tampilkanDataTransaksi(String noTrans) throws SQLException {
        ResultSet rs = db.getDataTransaksi(noTrans);

        while (rs.next()) {
            nomorTransaksi = rs.getString("NoTransaksi");
            namaPelanggan = rs.getString("namaPelanggan");
            jumlahNominal = rs.getInt("jumlahNominal");
            tanggalTransaksi = rs.getDate("tanggalTransaksi");
        }

        new WindowDataTransaksi().setVisible(true);
    }
    
    
}
