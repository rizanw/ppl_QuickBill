/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quickbill;

import DataBase.QuickBillData;
import UserAuthControl.Session;
import UserAuthControl.WindowLogin;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
        LocalDate localDate = LocalDate.now();
        System.out.println(DateTimeFormatter.ofPattern("yyy/MM/dd").format(localDate));

        QuickBillData db = new QuickBillData();
        db.createTableBarang();
        db.createTableKasir();
        db.createTableTransaksi();
//        db.insertIntoBarang("345678", "baju baru", 5600, 3);
//        db.insertIntoKasir("0987", "test1", "0822", "MIS", "email@email.com", "sandi");
//        db.insertIntoTransaksi("123456", "nama", 22, java.sql.Date.valueOf(localDate));
        db.printAllKasir();
        db.printAllBarang();
        db.printAllTransaksi();

        new WindowLogin().setVisible(true);
    }
}
