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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
//        db.insertIntoBarang("345677", "bajubaru", 5600, 3);
//        db.insertIntoKasir("0987", "test1", "0822", "MIS", "email@email.com", "sandi");
//        db.insertIntoTransaksi("123456", "nama", 22, java.sql.Date.valueOf(localDate));
        db.printAllKasir();
        db.printAllBarang();
        db.printAllTransaksi();

        String NoId = "345678";
        System.out.println("get singgle data :");
//        ResultSet rs = db.getDataBarang(NoId);
//        try {
//            while (rs.next()) {
//                System.out.printf("%s %s %d %d\n",
//                        NoIdBarang, namaBarang, hargaBarang, jumlahBarangTersedia
//                );
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(QuickBill.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        new WindowQuickBill().setVisible(true); 

//        int[] lottery = new int[49];
//        int i;
//        
//        for(i=0; i<lottery.length; i++){
//            lottery[i] = i;// +1;
//            System.out.println(lottery[i]);
//        }
    }
}
