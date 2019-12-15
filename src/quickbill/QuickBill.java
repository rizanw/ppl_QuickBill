/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quickbill;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.sql.ResultSet;

/**
 *
 * @author rizkyandre
 */
public class QuickBill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DBConnection db = new DBConnection();
        db.createTableBarang();
        db.createTableKasir();
        db.createTableTransaksi();
//        db.insertIntoBarang("345678", "baju baru", 5600, 3);
//        db.insertIntoKasir("0987", "test1", "0822", "MIS", "email@email.com", "sandi");
//        db.insertIntoTransaksi("123456", "nama", 22, java.sql.Date.valueOf(localDate));
        db.printAllKasir();
        db.printAllBarang();
        db.printAllTransaksi();
        
        new WindowQuickBill().setVisible(true);
//        ResultSet kasir = db.getDataKasir("0987");
//        new WindowDataKasir(kasir).setVisible(true);
    }
}
