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
        db.printAllBarang();
        
//        new WindowQuickBill().setVisible(true);
    }
}
