/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quickbill; 

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author rizkyandre
 */
public class FormDataTransaksi extends javax.swing.JPanel {
    
    private String tanggalHariIni;

    /**
     * Creates new form FormDataBarang
     */
    public FormDataTransaksi() {
        initComponents();
        LocalDate localDate = LocalDate.now();
        this.tanggalHariIni = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(localDate);
        fieldTanggalTransaksi.setText(tanggalHariIni);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        fieldNoTransaksi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fieldNamaPelanggan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fieldJumlahNominal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fieldTanggalTransaksi = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("No Transaksi :");

        fieldNoTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNoTransaksiActionPerformed(evt);
            }
        });

        jLabel2.setText("Nama Pelanggan :");

        jLabel3.setText("Jumlah Nominal :");

        fieldJumlahNominal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldJumlahNominalActionPerformed(evt);
            }
        });

        jLabel4.setText("Tanggal Transaksi : ");

        fieldTanggalTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTanggalTransaksiActionPerformed(evt);
            }
        });

        jButton1.setText("Tambah Transaksi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(0, 308, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fieldNoTransaksi)
            .addComponent(fieldNamaPelanggan)
            .addComponent(fieldJumlahNominal)
            .addComponent(fieldTanggalTransaksi)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldNoTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldNamaPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldJumlahNominal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldTanggalTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fieldJumlahNominalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldJumlahNominalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldJumlahNominalActionPerformed

    private void fieldTanggalTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTanggalTransaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldTanggalTransaksiActionPerformed

    private void fieldNoTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNoTransaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNoTransaksiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        int jumlahNominal = Integer.parseInt(fieldJumlahNominal.getText());
        String namaPelanggan = fieldNamaPelanggan.getText();
        String noTransaksi = fieldNoTransaksi.getText(); 
        
        String fieldTanggal = fieldTanggalTransaksi.getText(); 

        java.sql.Date tanggalTransaksi = java.sql.Date.valueOf( fieldTanggal );
        
        new Transaksi().tambahDataTransaksi(noTransaksi, namaPelanggan, jumlahNominal, tanggalTransaksi);
        
        fieldJumlahNominal.setText("");
        fieldTanggalTransaksi.setText(this.tanggalHariIni);
        fieldNamaPelanggan.setText("");
        fieldNoTransaksi.setText(""); 
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fieldJumlahNominal;
    private javax.swing.JTextField fieldNamaPelanggan;
    private javax.swing.JTextField fieldNoTransaksi;
    private javax.swing.JTextField fieldTanggalTransaksi;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
