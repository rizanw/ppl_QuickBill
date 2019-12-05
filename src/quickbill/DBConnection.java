/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quickbill;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DatabaseMetaData;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.derby.jdbc.EmbeddedDriver;

/**
 *
 * @author rizkyandre
 */
public class DBConnection {
//    private static final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
    private static final String dbURL = "jdbc:derby:quickbill.db;create=true";
    
    Connection conn = null;
    PreparedStatement pstmt = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    public DBConnection(){
        try {
            Driver derbyEmbeddedDriver = new EmbeddedDriver();
            DriverManager.registerDriver(derbyEmbeddedDriver);
            conn = DriverManager.getConnection(dbURL);
            if(conn != null){
                System.out.println("Connection Created!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void createTableKasir(){
        try {
            String kasir = "CREATE TABLE Kasir("
                    + "NoIdKasir varchar(50), "
                    + "namaKasir varchar(101), "
                    + "kontakKasir varchar(22), "
                    + "alamatKasir varchar(225), "
                    + "emailKasir varchar(112), "
                    + "kataSandiKasir varchar(250)"
                    + ")";
            if(!isTableExist("KASIR")){
                stmt = conn.createStatement();
                stmt.execute(kasir);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void createTableBarang(){
        try{
            String barang = "CREATE TABLE Barang("
                    + "NoIdBarang varchar(50), "
                    + "namaBarang varchar(101), "
                    + "hargaBarang integer, "
                    + "jumlahBarangTersedia integer"
                    + ")";
            if(!isTableExist("BARANG")){
                stmt = conn.createStatement();
                stmt.execute(barang);
            }
        }catch(SQLException e){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void createTableTransaksi(){
        try{
            String transaksi = "CREATE TABLE Transaksi("
                    + "NoTransaksi varchar(50), "
                    + "namaPelanggan varchar(101), "
                    + "jumlahNominal integer,"
                    + "tanggalTransaksi DATE"
                    + ")";
            if(!isTableExist("TRANSAKSI")){
                stmt = conn.createStatement();
                stmt.execute(transaksi);
            }
        }catch(SQLException e){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public boolean insertIntoBarang(String NoIdBarang, String namaBarang, int hargaBarang, int jumlahBarangTersedia){
        int status;
        try{
            String q = "insert into Barang(NoIdBarang,namaBarang,hargaBarang,jumlahBarangTersedia)"
                    + "values(?,?,?,?)";
            pstmt = conn.prepareStatement(q);
            pstmt.setString(1, NoIdBarang);
            pstmt.setString(2, namaBarang);
            pstmt.setInt(3, hargaBarang);
            pstmt.setInt(4, jumlahBarangTersedia);
            status = pstmt.executeUpdate();
            
            if (status > 0) {
                System.out.println("success");
                return true;
            } else {
                System.out.println("stuck somewhere");
                return false;
            }
        }catch(SQLException e){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return false;
    }
    
    public boolean insertIntoKasir(String NoId, String nama, String kontak, String alamat, String email, String kataSandi){
        int status;
        try{
            String q = "insert into Kasir(NoIdKasir, namaKasir, kontakKasir, alamatKasir, emailKasir, kataSandiKasir)"
                    + "values(?,?,?,?,?,?)";
            pstmt = conn.prepareStatement(q);
            pstmt.setString(1, NoId);
            pstmt.setString(2, nama);
            pstmt.setString(3, kontak);
            pstmt.setString(4, alamat);
            pstmt.setString(5, email);
            pstmt.setString(6, kataSandi);
            status = pstmt.executeUpdate();
            
            if (status > 0) {
                System.out.println("success");
                return true;
            } else {
                System.out.println("stuck somewhere");
                return false;
            }
        }catch(SQLException e){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return false;
    }
    
    public boolean insertIntoTransaksi(String NoTransaksi, String namaPelanggan, int jumlahNominal, Date tanggalTransaksi){
        int status;
        
        try{
            String q = "insert into Transaksi(NoTransaksi,namaPelanggan,jumlahNominal,tanggalTransaksi)"
                    + "values(?,?,?,?)";
            pstmt = conn.prepareStatement(q);
            pstmt.setString(1, NoTransaksi);
            pstmt.setString(2, namaPelanggan);
            pstmt.setInt(3, jumlahNominal);
            pstmt.setDate(4, tanggalTransaksi);
            status = pstmt.executeUpdate();
            
            if (status > 0) {
                System.out.println("success");
                return true;
            } else {
                System.out.println("stuck somewhere");
                return false;
            }
        }catch(SQLException e){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return false;
    }
    
    public void printAllBarang(){
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from Barang");
            while (rs.next()) {
                System.out.printf("%s %s %d %d\n",
                        rs.getString(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4)
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void printAllKasir(){
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from Kasir");
            while (rs.next()) {
                System.out.printf("%s %s %s %s %s %s\n",
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void printAllTransaksi(){
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from Transaksi");
            while (rs.next()) {
                System.out.printf("%s %s %d %s",
                        rs.getString(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4)
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean isTableExist(String name){
        try {
            DatabaseMetaData dbm = conn.getMetaData();
            rs = dbm.getTables(null, null, name, null);
            if(rs.next()){
                System.out.println(name + " already exists");
                return true;
            }else{
                System.out.println(name + " Not Exist");
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
   
}
