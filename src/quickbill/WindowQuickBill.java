/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quickbill;

import UserAuthControl.Session;
import UserAuthControl.WindowLogin;
import java.awt.FlowLayout;

/**
 *
 * @author rizkyandre
 */
public class WindowQuickBill extends javax.swing.JFrame {

    /**
     * Creates new form windowQuickBill
     */
    public WindowQuickBill() {
        initComponents();
        
//        if("1".equals(role)){
//            menuCariBarang.setEnabled(true);
//            menuDaftarBarang.setEnabled(true);
//            menuTambahDataBarang.setEnabled(true);
//            menuCariTransaksi.setEnabled(true);
//            menuDaftarTransaksi.setEnabled(true);
//            menuTambahTransaksi.setEnabled(true);
//            menuTambahKasir.setEnabled(true);
//            menuDaftarKasir.setEnabled(true);
//        }else if("2".equals(role)){
//            menuCariBarang.setEnabled(true);
//            menuDaftarBarang.setEnabled(true);
//            menuTambahDataBarang.setEnabled(true);
//            menuCariTransaksi.setEnabled(true);
//            menuDaftarTransaksi.setEnabled(true);
//            menuTambahTransaksi.setEnabled(true);
//            menuTambahKasir.setEnabled(false);
//            menuDaftarKasir.setEnabled(false);
//        }else{
//            menuCariBarang.setEnabled(false);
//            menuDaftarBarang.setEnabled(false);
//            menuTambahDataBarang.setEnabled(false);
//            menuCariTransaksi.setEnabled(false);
//            menuDaftarTransaksi.setEnabled(false);
//            menuTambahTransaksi.setEnabled(false);
//            menuTambahKasir.setEnabled(false);
//            menuDaftarKasir.setEnabled(false);
//        }
        
        mainPanel.setLayout(new FlowLayout());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        titleWelcome = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        menuQuickBill = new javax.swing.JMenu();
        menuMainPanel = new javax.swing.JMenuItem();
        menuLogin = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenuItem();
        menuStock = new javax.swing.JMenu();
        menuTambahDataBarang = new javax.swing.JMenuItem();
        menuDaftarBarang = new javax.swing.JMenuItem();
        menuCariBarang = new javax.swing.JMenuItem();
        menuCashier = new javax.swing.JMenu();
        menuTambahKasir = new javax.swing.JMenuItem();
        menuDaftarKasir = new javax.swing.JMenuItem();
        menuTransaction = new javax.swing.JMenu();
        menuTambahTransaksi = new javax.swing.JMenuItem();
        menuDaftarTransaksi = new javax.swing.JMenuItem();
        menuCariTransaksi = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QuickBill BetaMart");
        setBackground(new java.awt.Color(255, 255, 255));

        titleWelcome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        titleWelcome.setText("Welcome to QuickBill");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(220, Short.MAX_VALUE)
                .addComponent(titleWelcome)
                .addContainerGap(220, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(205, Short.MAX_VALUE)
                .addComponent(titleWelcome)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        menuQuickBill.setText("QuickBill");

        menuMainPanel.setText("Main Panel");
        menuMainPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMainPanelActionPerformed(evt);
            }
        });
        menuQuickBill.add(menuMainPanel);

        menuLogin.setText("Login");
        menuLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLoginActionPerformed(evt);
            }
        });
        menuQuickBill.add(menuLogin);

        menuExit.setText("Exit");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        menuQuickBill.add(menuExit);

        jMenuBar.add(menuQuickBill);

        menuStock.setText("Stock");

        menuTambahDataBarang.setText("Tambah Data Barang");
        menuTambahDataBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTambahDataBarangActionPerformed(evt);
            }
        });
        menuStock.add(menuTambahDataBarang);

        menuDaftarBarang.setText("Daftar Data Barang");
        menuDaftarBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDaftarBarangActionPerformed(evt);
            }
        });
        menuStock.add(menuDaftarBarang);

        menuCariBarang.setText("Cari Data Barang");
        menuCariBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCariBarangActionPerformed(evt);
            }
        });
        menuStock.add(menuCariBarang);

        jMenuBar.add(menuStock);

        menuCashier.setText("Cashier");

        menuTambahKasir.setText("Tambah Kasir");
        menuTambahKasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTambahKasirActionPerformed(evt);
            }
        });
        menuCashier.add(menuTambahKasir);

        menuDaftarKasir.setText("Daftar Kasir");
        menuDaftarKasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDaftarKasirActionPerformed(evt);
            }
        });
        menuCashier.add(menuDaftarKasir);

        jMenuBar.add(menuCashier);

        menuTransaction.setText("Transaction");

        menuTambahTransaksi.setText("Tambah Transaksi");
        menuTambahTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTambahTransaksiActionPerformed(evt);
            }
        });
        menuTransaction.add(menuTambahTransaksi);

        menuDaftarTransaksi.setText("Daftar Transaksi");
        menuDaftarTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDaftarTransaksiActionPerformed(evt);
            }
        });
        menuTransaction.add(menuDaftarTransaksi);

        menuCariTransaksi.setText("Cari Transaksi");
        menuCariTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCariTransaksiActionPerformed(evt);
            }
        });
        menuTransaction.add(menuCariTransaksi);

        jMenuBar.add(menuTransaction);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuMainPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMainPanelActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        mainPanel.add(titleWelcome);
        mainPanel.repaint();
        mainPanel.validate();
    }//GEN-LAST:event_menuMainPanelActionPerformed

    private void menuTambahDataBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTambahDataBarangActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        mainPanel.add(new FormDataBarang());
        mainPanel.validate();
    }//GEN-LAST:event_menuTambahDataBarangActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_menuExitActionPerformed

    private void menuTambahTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTambahTransaksiActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        mainPanel.add(new FormDataTransaksi());
        mainPanel.validate();        
    }//GEN-LAST:event_menuTambahTransaksiActionPerformed

    private void menuCariTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCariTransaksiActionPerformed
        // TODO add your handling code here:
        new FormCariTransaksi().setVisible(true);
    }//GEN-LAST:event_menuCariTransaksiActionPerformed

    private void menuDaftarTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDaftarTransaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuDaftarTransaksiActionPerformed

    private void menuTambahKasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTambahKasirActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        mainPanel.add(new FormDataKasir());
        mainPanel.validate();
    }//GEN-LAST:event_menuTambahKasirActionPerformed

    private void menuDaftarKasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDaftarKasirActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        mainPanel.add(new DaftarKasir());
        mainPanel.validate();
    }//GEN-LAST:event_menuDaftarKasirActionPerformed

    private void menuDaftarBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDaftarBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuDaftarBarangActionPerformed

    private void menuCariBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCariBarangActionPerformed
        // TODO add your handling code here:
        new FormCariBarang().setVisible(true);
    }//GEN-LAST:event_menuCariBarangActionPerformed

    private void menuLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLoginActionPerformed
        // TODO add your handling code here:
        new WindowLogin().setVisible(true);
    }//GEN-LAST:event_menuLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WindowQuickBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WindowQuickBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WindowQuickBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WindowQuickBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WindowQuickBill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuItem menuCariBarang;
    private javax.swing.JMenuItem menuCariTransaksi;
    private javax.swing.JMenu menuCashier;
    private javax.swing.JMenuItem menuDaftarBarang;
    private javax.swing.JMenuItem menuDaftarKasir;
    private javax.swing.JMenuItem menuDaftarTransaksi;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenuItem menuLogin;
    private javax.swing.JMenuItem menuMainPanel;
    private javax.swing.JMenu menuQuickBill;
    private javax.swing.JMenu menuStock;
    private javax.swing.JMenuItem menuTambahDataBarang;
    private javax.swing.JMenuItem menuTambahKasir;
    private javax.swing.JMenuItem menuTambahTransaksi;
    private javax.swing.JMenu menuTransaction;
    private javax.swing.JLabel titleWelcome;
    // End of variables declaration//GEN-END:variables
}
