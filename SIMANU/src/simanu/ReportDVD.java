
package simanu;

import java.sql.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class ReportDVD extends javax.swing.JInternalFrame {
    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    //untuk tombol clear
    private void bersihkan(){
        txtID.setText(null);
        txtKode.setText(null);
        txtNama.setText(null);
        cmbMerek.setSelectedItem("=Pilih=");
        txtHarga.setText(null);
        txtStock.setText(null);
    }
    
    //dapatkan last id
    private void idTerakhir(){
        try{
            String sql = "select id_dvdrom from dvdrom";
             pst = conn.prepareStatement(sql);
             rs = pst.executeQuery();
             
             while(rs.next()){
                 String dataku = rs.getString("id_dvdrom");
                 int idMB = Integer.parseInt(dataku)+1;
                 txtID.setText(String.valueOf(idMB));
             }
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    private void kodeTerakhir(){
        
        try{
            String sql = "select kode_dvdrom from dvdrom";
             pst = conn.prepareStatement(sql);
             ResultSet rs = pst.executeQuery();
             if(!rs.isBeforeFirst()){
                 String KodeTerbaru = "CD0001";
                 txtKode.setText(KodeTerbaru);
             }else{
                while(rs.next()){
                    String kodeku = rs.getString("kode_dvdrom");
                    String dapatAngka= kodeku.replaceAll("[^0-9]", "");
                    int kodeBaru = Integer.parseInt(dapatAngka)+1;
                    String KodeTerbaru = "CD000"+kodeBaru;
                    txtKode.setText(String.valueOf(KodeTerbaru));
                }
             }
                
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    //menampilkan tabel
    private void UpdateTabel(){
        
        DefaultTableModel tabelMb = new DefaultTableModel();
        //tabelMb.setAutoResizeMode(DefaultTableModel.AUTO_RESIZE_OFF);
        tabelMb.addColumn("ID");
        tabelMb.addColumn("KODE");
        tabelMb.addColumn("NAMA");
        tabelMb.addColumn("MEREK");
        tabelMb.addColumn("HARGA");
        tabelMb.addColumn("STOCK");
        
        
        try{
            String sql = "select * from dvdrom";
            Statement stm = (Statement) conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                Object[] a = new Object[6];
                a[0] = rs.getString("id_dvdrom");
                a[1] = rs.getString("kode_dvdrom");
                a[2] = rs.getString("nama_dvdrom");
                a[3] = rs.getString("merek_dvdrom");
                a[4] = rs.getString("harga_dvdrom");
                a[5] = rs.getString("stock_dvdrom");
                tabelMb.addRow(a);
            }
            tabelMotherboard.setModel(tabelMb);
            tabelMotherboard.getColumnModel().getColumn(0).setPreferredWidth(20);
            tabelMotherboard.getColumnModel().getColumn(2).setPreferredWidth(350);
            tabelMotherboard.getColumnModel().getColumn(5).setPreferredWidth(50);
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void tampilkan_merek(){
        try{
             String sql = "select nama_merek from merek where kat_dvd !=0";
             pst = conn.prepareStatement(sql);
             rs = pst.executeQuery();
             
             while(rs.next()){
                 String dataku = rs.getString("nama_merek");
                 cmbMerek.addItem(dataku);
             }
             
             
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    public ReportDVD() {
        initComponents();
        BasicInternalFrameUI bi;
        bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        conn = simanu.KoneksiDB.simanuDb();
        tampilkan_merek();
        UpdateTabel();
        bersihkan();
        txtID.setEnabled(false);
        idTerakhir();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelMotherboard = new javax.swing.JTable();
        cmbMerek = new javax.swing.JComboBox();
        txtNama = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        btnClosed = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnKode = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        lblStock = new javax.swing.JLabel();
        lblHarga = new javax.swing.JLabel();
        lblMerek = new javax.swing.JLabel();
        lblKode = new javax.swing.JLabel();
        lblNama = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 255, 102));
        setForeground(new java.awt.Color(153, 255, 153));

        jPanel1.setLayout(null);

        tabelMotherboard.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelMotherboard.getTableHeader().setReorderingAllowed(false);
        tabelMotherboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMotherboardMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelMotherboard);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 430, 780, 170);

        cmbMerek.setBackground(new java.awt.Color(255, 255, 255));
        cmbMerek.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "=Pilih=" }));
        jPanel1.add(cmbMerek);
        cmbMerek.setBounds(210, 190, 250, 40);

        txtNama.setBackground(new java.awt.Color(255, 255, 255));
        txtNama.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNama.setForeground(new java.awt.Color(0, 0, 0));
        txtNama.setToolTipText("");
        txtNama.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txtNama);
        txtNama.setBounds(210, 130, 410, 40);

        txtStock.setBackground(new java.awt.Color(255, 255, 255));
        txtStock.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtStock.setForeground(new java.awt.Color(0, 0, 0));
        txtStock.setToolTipText("");
        txtStock.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txtStock);
        txtStock.setBounds(210, 310, 250, 40);

        txtHarga.setBackground(new java.awt.Color(255, 255, 255));
        txtHarga.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtHarga.setForeground(new java.awt.Color(0, 0, 0));
        txtHarga.setToolTipText("");
        txtHarga.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txtHarga);
        txtHarga.setBounds(210, 250, 250, 40);

        txtID.setBackground(new java.awt.Color(255, 255, 255));
        txtID.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtID.setForeground(new java.awt.Color(0, 0, 0));
        txtID.setToolTipText("");
        txtID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtID);
        txtID.setBounds(210, 10, 60, 40);

        btnClosed.setBackground(new java.awt.Color(153, 255, 255));
        btnClosed.setForeground(new java.awt.Color(0, 0, 0));
        btnClosed.setIcon(new javax.swing.ImageIcon("D:\\Simanu\\Asset\\close.png")); // NOI18N
        btnClosed.setText("TUTUP");
        btnClosed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClosedActionPerformed(evt);
            }
        });
        jPanel1.add(btnClosed);
        btnClosed.setBounds(620, 380, 110, 40);

        btnHapus.setBackground(new java.awt.Color(153, 255, 255));
        btnHapus.setForeground(new java.awt.Color(0, 0, 0));
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simanu/delete.png"))); // NOI18N
        btnHapus.setText("HAPUS");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        jPanel1.add(btnHapus);
        btnHapus.setBounds(340, 380, 110, 40);

        btnClear.setBackground(new java.awt.Color(153, 255, 255));
        btnClear.setForeground(new java.awt.Color(0, 0, 0));
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simanu/clear.png"))); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear);
        btnClear.setBounds(480, 380, 110, 40);

        btnEdit.setBackground(new java.awt.Color(153, 255, 255));
        btnEdit.setForeground(new java.awt.Color(0, 0, 0));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simanu/edit.png"))); // NOI18N
        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel1.add(btnEdit);
        btnEdit.setBounds(190, 380, 110, 40);

        btnKode.setBackground(new java.awt.Color(153, 255, 255));
        btnKode.setForeground(new java.awt.Color(0, 0, 0));
        btnKode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simanu/pen.png"))); // NOI18N
        btnKode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKodeActionPerformed(evt);
            }
        });
        jPanel1.add(btnKode);
        btnKode.setBounds(390, 70, 60, 40);

        btnTambah.setBackground(new java.awt.Color(153, 255, 255));
        btnTambah.setForeground(new java.awt.Color(0, 0, 0));
        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simanu/add2.png"))); // NOI18N
        btnTambah.setText("TAMBAH");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        jPanel1.add(btnTambah);
        btnTambah.setBounds(40, 380, 110, 40);

        lblId.setBackground(new java.awt.Color(255, 255, 255));
        lblId.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setText("ID");
        jPanel1.add(lblId);
        lblId.setBounds(20, 20, 100, 24);

        txtKode.setBackground(new java.awt.Color(255, 255, 255));
        txtKode.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtKode.setForeground(new java.awt.Color(0, 0, 0));
        txtKode.setToolTipText("");
        txtKode.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txtKode);
        txtKode.setBounds(210, 70, 160, 40);

        lblStock.setBackground(new java.awt.Color(255, 255, 255));
        lblStock.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblStock.setForeground(new java.awt.Color(255, 255, 255));
        lblStock.setText("STOK");
        jPanel1.add(lblStock);
        lblStock.setBounds(20, 320, 100, 24);

        lblHarga.setBackground(new java.awt.Color(255, 255, 255));
        lblHarga.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblHarga.setForeground(new java.awt.Color(255, 255, 255));
        lblHarga.setText("HARGA");
        jPanel1.add(lblHarga);
        lblHarga.setBounds(20, 250, 100, 24);

        lblMerek.setBackground(new java.awt.Color(255, 255, 255));
        lblMerek.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblMerek.setForeground(new java.awt.Color(255, 255, 255));
        lblMerek.setText("MEREK");
        jPanel1.add(lblMerek);
        lblMerek.setBounds(20, 190, 100, 24);

        lblKode.setBackground(new java.awt.Color(255, 255, 255));
        lblKode.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblKode.setForeground(new java.awt.Color(255, 255, 255));
        lblKode.setText("KODE");
        jPanel1.add(lblKode);
        lblKode.setBounds(20, 70, 100, 24);

        lblNama.setBackground(new java.awt.Color(255, 255, 255));
        lblNama.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNama.setForeground(new java.awt.Color(255, 255, 255));
        lblNama.setText("NAMA PRODUK");
        jPanel1.add(lblNama);
        lblNama.setBounds(20, 130, 160, 32);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simanu/background-blue.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -50, 810, 660);

        jPanel3.setBackground(new java.awt.Color(46, 204, 113));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("= Master Data CD/DVD-ROM = ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(106, 106, 106)
                .addComponent(jLabel2)
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setBounds(300, 0, 809, 709);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
       this.dispose();
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try{
            Connection conn = null;
            Statement stmt = null;
            String sql = "Update dvdrom SET kode_dvdrom ='"+txtKode.getText()+"', nama_dvdrom ='"+txtNama.getText()+"', merek_dvdrom ='"+cmbMerek.getSelectedItem()+"',harga_dvdrom ='"+txtHarga.getText()+"', stock_dvdrom ='"+txtStock.getText()+"' WHERE id_dvdrom ='"+txtID.getText()+"'";
            
            conn = simanu.KoneksiDB.simanuDb();
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(rootPane,"Data berhasil diedit");
            this.UpdateTabel();
            txtID.setEnabled(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnClosedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClosedActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnClosedActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        this.bersihkan();
        txtID.setEnabled(false);
        idTerakhir();
    }//GEN-LAST:event_btnClearActionPerformed

    private void tabelMotherboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMotherboardMouseClicked
        int baris = tabelMotherboard.rowAtPoint(evt.getPoint());
        
        String idMb = tabelMotherboard.getValueAt(baris, 0).toString();
        txtID.setText(idMb);
        String kode = tabelMotherboard.getValueAt(baris, 1).toString();
        txtKode.setText(kode);
        String nama = tabelMotherboard.getValueAt(baris, 2).toString();
        txtNama.setText(nama);
        String merek = tabelMotherboard.getValueAt(baris, 3).toString();
        cmbMerek.setSelectedItem(merek);
        String harga = tabelMotherboard.getValueAt(baris, 4).toString();
        txtHarga.setText(harga);
        String stock = tabelMotherboard.getValueAt(baris, 5).toString();
        txtStock.setText(stock);
    }//GEN-LAST:event_tabelMotherboardMouseClicked

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void btnKodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKodeActionPerformed
        kodeTerakhir();
        
    }//GEN-LAST:event_btnKodeActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        if(txtKode.getText().equals("") ||
           txtNama.getText().equals("") ||
           txtHarga.getText().equals("") ||
           txtStock.getText().equals("") ||     
           cmbMerek.getSelectedItem().equals("=Pilih=")){
            JOptionPane.showMessageDialog(rootPane, "Silahkan pilih data yang ingin dihapus!");
            bersihkan();
            idTerakhir();
            txtID.setEnabled(false);
        } else {
            
            int input = JOptionPane.showConfirmDialog(null, "Apakah anda ingin menghapus data ini ?");
            if (String.valueOf(input).equals("0")){
                try{
                    Connection conn = null;
                    Statement stmt = null;
                    String sql = "DELETE from dvdrom WHERE id_dvdrom='"+txtID.getText()+"'";
                    conn = simanu.KoneksiDB.simanuDb();
                    stmt = conn.createStatement();
                    stmt.executeUpdate(sql);
                    UpdateTabel();
                    JOptionPane.showMessageDialog(rootPane, "Data berhasil dihapus!");
                    bersihkan();
                    idTerakhir();
                    txtID.setEnabled(false);  
                } catch(Exception e){
                     JOptionPane.showMessageDialog(null, e);
                }
                
            }else if(String.valueOf(input).equals("1")){
                //ini option no
            }else{
              //ini cancel
            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        if(txtKode.getText().equals("") ||
           txtNama.getText().equals("") ||
           txtHarga.getText().equals("") ||
           txtStock.getText().equals("") ||     
           cmbMerek.getSelectedItem().equals("=Pilih=")){
            JOptionPane.showMessageDialog(rootPane, "Data belum lengkap!");
        } else {
            String kodeM = txtKode.getText();
            String namaM = txtNama.getText();
            String hargaM = txtHarga.getText();
            String stockM = txtStock.getText();
            Object cmbM = cmbMerek.getSelectedItem();
            try{
                Connection conn = null;
                Statement stmt = null;
                conn = simanu.KoneksiDB.simanuDb();
                stmt = conn.createStatement();
                stmt.executeUpdate("insert into dvdrom(kode_dvdrom,nama_dvdrom,merek_dvdrom,harga_dvdrom,stock_dvdrom) values('"+kodeM+"','"+namaM+"','"+cmbM+"','"+hargaM+"','"+stockM+"')");
                JOptionPane.showMessageDialog(rootPane,"Data berhasil ditambahkan");
                UpdateTabel();
                bersihkan();
                idTerakhir();
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnTambahActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClosed;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKode;
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox cmbMerek;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHarga;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblKode;
    private javax.swing.JLabel lblMerek;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblStock;
    private javax.swing.JTable tabelMotherboard;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
