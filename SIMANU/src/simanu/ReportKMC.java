
package simanu;

import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class ReportKMC extends javax.swing.JInternalFrame {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    private void UpdateTabel(){
        String sql = "select id_kmc as ID, nama_kmc as NAMA,  harga_kmc as HARGA, stock_kmc as STOCK from keymosecase";
        //String col[] = {"Product No", "Name"};
        
        try{
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tabelKMC.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public ReportKMC() {
        initComponents();
        conn = simanu.KoneksiDB.simanuDb();
        //tampil_code();
        UpdateTabel();
        
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
        tabelKMC = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNamaKmc = new javax.swing.JTextField();
        txtHargaKmc = new javax.swing.JTextField();
        txtStockKmc = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);

        tabelKMC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelKMC);

        jLabel1.setText("Nama");

        jLabel2.setText("Harga");

        jLabel3.setText("Stock");

        txtStockKmc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockKmcActionPerformed(evt);
            }
        });

        jButton1.setText("Tambah");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Tutup");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(27, 27, 27)
                        .addComponent(jButton2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNamaKmc)
                        .addComponent(txtHargaKmc)
                        .addComponent(txtStockKmc, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNamaKmc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHargaKmc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtStockKmc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtStockKmcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockKmcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockKmcActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Connection conn = null;
        Statement stmt = null;
        if(txtNamaKmc.getText().equals("") ||
           txtHargaKmc.getText().equals("") ||
           txtStockKmc.getText().equals("")){
            
            JOptionPane.showMessageDialog(rootPane, "Data Belum Lengkap");
        } else {
            
            String nama = txtNamaKmc.getText();
            String harga = txtHargaKmc.getText();
            String stock = txtStockKmc.getText();
     
            try{
                conn = simanu.KoneksiDB.simanuDb();
                stmt = conn.createStatement();
                stmt.executeUpdate("insert into keymosecase(nama_kmc,harga_kmc,stock_kmc) values('"+nama+"','"+harga+"','"+stock+"')");
                JOptionPane.showMessageDialog(rootPane,"Data berhasil ditambahkan");
                txtNamaKmc.setText("");
                txtHargaKmc.setText("");
                txtStockKmc.setText("");
                UpdateTabel();
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelKMC;
    private javax.swing.JTextField txtHargaKmc;
    private javax.swing.JTextField txtNamaKmc;
    private javax.swing.JTextField txtStockKmc;
    // End of variables declaration//GEN-END:variables
}