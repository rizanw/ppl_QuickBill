/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quickbill;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author rzkan
 */
public class PesanKonfirmasi {
    public void tutupWindow(){
        
    }
    
    public void penambahanDataBarangDilakukan(){
        Component parentComponent = null;
        JOptionPane.showMessageDialog(parentComponent, "Data Barang Berhasil Ditambahkan");
    }
    
    public void penambahanDataKasirDilakukan(){
        Component parentComponent = null;
        JOptionPane.showMessageDialog(parentComponent, "Data Kasir Berhasil Ditambahkan");
    }
    
    public void perubahanDataKasir(){
    
    }
    
    public void penghapusanDataKasir(){
        
    }
    
    public void peringatanGagalTransaksi(){
    
    }
}
