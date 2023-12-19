/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package java2;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GORKEM
 */
public class Hafta_07_Tablo extends javax.swing.JFrame {

    /**
     * Creates new form Hafta_07_Tablo
     */
    public Hafta_07_Tablo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Urunler = new javax.swing.JTable();
        txt_Ad = new javax.swing.JTextField();
        cb_Kategori = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_Fiyat = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_Ekle = new javax.swing.JButton();
        txt_mesaj = new javax.swing.JLabel();
        btn_Guncelle = new javax.swing.JButton();
        btn_sil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_Urunler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ürün Adı", "Kategori", "Fiyat"
            }
        ));
        tbl_Urunler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_UrunlerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_Urunler);

        cb_Kategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sanat", "Gıda", "Spor", "Giyim" }));

        jLabel1.setText("Kategori");

        jLabel2.setText("Ürün Adı");

        jLabel3.setText("Fiyat");

        btn_Ekle.setText("Ekle");
        btn_Ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EkleActionPerformed(evt);
            }
        });

        btn_Guncelle.setText("Güncelle");
        btn_Guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuncelleActionPerformed(evt);
            }
        });

        btn_sil.setText("Sil");
        btn_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_silActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel1)))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_Ad, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_Kategori, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Ekle, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(txt_mesaj)
                    .addComponent(btn_Guncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_sil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txt_mesaj))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_Ad, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cb_Kategori, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btn_Ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_EkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EkleActionPerformed
        DefaultTableModel modelim=(DefaultTableModel)tbl_Urunler.getModel();
        if(txt_Ad.getText().trim().equals("")){
            txt_mesaj.setText("Ürün Adı Boş Girilemez!");
        }else{
        modelim.addRow(new Object[]{txt_Ad.getText(),cb_Kategori.getSelectedItem().toString(),txt_Fiyat.getText()});        
        }
        tbl_Urunler.setModel(modelim);
    }//GEN-LAST:event_btn_EkleActionPerformed

    private void btn_GuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuncelleActionPerformed
        DefaultTableModel modelim=(DefaultTableModel)tbl_Urunler.getModel();
        if(tbl_Urunler.getSelectedRow()==-1){
            if(tbl_Urunler.getRowCount()==0){
                txt_mesaj.setText("TABLO BOŞ!");                
            }else{
                txt_mesaj.setText("Tablodan Ürün Seçiniz..");
            }
        }else{
            modelim.setValueAt(txt_Ad.getText(), tbl_Urunler.getSelectedRow(),0);
            modelim.setValueAt(cb_Kategori.getSelectedItem().toString(), tbl_Urunler.getSelectedRow(),1);
            modelim.setValueAt(txt_Fiyat.getText(), tbl_Urunler.getSelectedRow(),2);
        }
    }//GEN-LAST:event_btn_GuncelleActionPerformed

    private void tbl_UrunlerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_UrunlerMouseClicked
       DefaultTableModel modelim=(DefaultTableModel)tbl_Urunler.getModel();
       txt_Ad.setText(modelim.getValueAt(tbl_Urunler.getSelectedRow(), 0).toString());
       cb_Kategori.setSelectedItem(modelim.getValueAt(tbl_Urunler.getSelectedRow(), 1));
       txt_Fiyat.setText(modelim.getValueAt(tbl_Urunler.getSelectedRow(), 2).toString());
       
    }//GEN-LAST:event_tbl_UrunlerMouseClicked

    private void btn_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_silActionPerformed
        DefaultTableModel modelim=(DefaultTableModel)tbl_Urunler.getModel();
        if(tbl_Urunler.getSelectedRow()==-1){
            if(tbl_Urunler.getRowCount()==0){
                txt_mesaj.setText("TABLO BOŞ!");                
            }else{
                txt_mesaj.setText("Tablodan Ürün Seçiniz..");
            }
        }else{
            modelim.removeRow(tbl_Urunler.getSelectedRow());
        }
    }//GEN-LAST:event_btn_silActionPerformed

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
            java.util.logging.Logger.getLogger(Hafta_07_Tablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hafta_07_Tablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hafta_07_Tablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hafta_07_Tablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hafta_07_Tablo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Ekle;
    private javax.swing.JButton btn_Guncelle;
    private javax.swing.JButton btn_sil;
    private javax.swing.JComboBox<String> cb_Kategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_Urunler;
    private javax.swing.JTextField txt_Ad;
    private javax.swing.JTextField txt_Fiyat;
    private javax.swing.JLabel txt_mesaj;
    // End of variables declaration//GEN-END:variables
}