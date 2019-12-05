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
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.derby.jdbc.EmbeddedDriver;

/**
 *
 * @author rizkyandre
 */
public class DBConnection {
//    private static final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
    private static String dbURL = "jdbc:derby:quickbill.db;create=true";
    
    Connection conn = null;
    PreparedStatement pstmt = null;
    Statement stmt;
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
                    + "emailKaisr varchar(112), "
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
                    + "tanggalTransaksi varchar(50)"
                    + ")";
            if(!isTableExist("TRANSAKSI")){
                stmt = conn.createStatement();
                stmt.execute(transaksi);
            }
        }catch(SQLException e){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void insertIntoBarang(String NoIdBarang, String namaBarang, int hargaBarang, int jumlahBarangTersedia){
        try{
            String q = "insert into Barang(NoIdBarang,namaBarang,hargaBarang,jumlahBarangTersedia)"
                    + "values(?,?,?,?)";
            pstmt = conn.prepareStatement(q);
            pstmt.setString(1, NoIdBarang);
            pstmt.setString(2, namaBarang);
            pstmt.setInt(3, hargaBarang);
            pstmt.setInt(4, jumlahBarangTersedia);
            pstmt.executeUpdate();
        }catch(SQLException e){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, e);
        }
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
