/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simanu;

import java.sql.*;
import javax.swing.*;
import java.text.*;

public class rakitPC extends javax.swing.JInternalFrame {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    static Statement stmt;
    
    
    void tampil_mb(){
        try{
             String sql = "select nama_mb from motherboard";
             pst = conn.prepareStatement(sql);
             rs = pst.executeQuery();
             
             while(rs.next()){
                 String dataku = rs.getString("nama_mb");
                 cmbMotherboard.addItem(dataku);
             }
             
             
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    void tampil_ram(){
        try{
             String sql = "select nama_ram from ram";
             pst = conn.prepareStatement(sql);
             rs = pst.executeQuery();
             
             while(rs.next()){
                 String dataku = rs.getString("nama_ram");
                 cmbRam.addItem(dataku);
             }
             
             
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    void tampil_proc(){
        try{
             String sql = "select nama_p from processor";
             pst = conn.prepareStatement(sql);
             rs = pst.executeQuery();
             
             while(rs.next()){
                 String dataku = rs.getString("nama_p");
                 cmbProc.addItem(dataku);
             }
             
             
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    void tampil_dd(){
        try{
             String sql = "select nama_dd from diskdrive";
             pst = conn.prepareStatement(sql);
             rs = pst.executeQuery();
             
             while(rs.next()){
                 String dataku = rs.getString("nama_dd");
                 cmbDd.addItem(dataku);
             }
             
             
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    void tampil_vga(){
        try{
             String sql = "select nama_vga from vga";
             pst = conn.prepareStatement(sql);
             rs = pst.executeQuery();
             
             while(rs.next()){
                 String dataku = rs.getString("nama_vga");
                 cmbVga.addItem(dataku);
             }
             
             
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    void tampil_psu(){
        try{
             String sql = "select nama_psu from psu";
             pst = conn.prepareStatement(sql);
             rs = pst.executeQuery();
             
             while(rs.next()){
                 String dataku = rs.getString("nama_psu");
                 cmbPsu.addItem(dataku);
             }
             
             
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    void tampil_monitor(){
        try{
             String sql = "select nama_mnt from monitor";
             pst = conn.prepareStatement(sql);
             rs = pst.executeQuery();
             
             while(rs.next()){
                 String dataku = rs.getString("nama_mnt");
                 cmbMonitor.addItem(dataku);
             }
             
             
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    void tampil_dvd(){
        try{
             String sql = "select nama_dvdrom from dvdrom";
             pst = conn.prepareStatement(sql);
             rs = pst.executeQuery();
             
             while(rs.next()){
                 String dataku = rs.getString("nama_dvdrom");
                 cmbDVD.addItem(dataku);
             }
             
             
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    void tampil_kmc(){
        try{
             String sql = "select nama_kmc from keymosecase";
             pst = conn.prepareStatement(sql);
             rs = pst.executeQuery();
             
             while(rs.next()){
                 String dataku = rs.getString("nama_kmc");
                 cmbKMC.addItem(dataku);
             }
             
             
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public rakitPC() {
        setTitle("Form Perakitan");
        //setVisible(true);
        ///setLayout(null);
        initComponents();
        conn = simanu.KoneksiDB.simanuDb();
        tampil_mb();
        tampil_ram();
        tampil_proc();
        tampil_dd();
        tampil_vga();
        tampil_psu();
        tampil_monitor();
        tampil_dvd();
        tampil_kmc();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        cmbMotherboard = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblMb = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblRam = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        hasilRAM = new javax.swing.JLabel();
        lblProc = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        hasilProc = new javax.swing.JLabel();
        lblHDD = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        hasilHDD = new javax.swing.JLabel();
        lblVGA = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        hasilVGA = new javax.swing.JLabel();
        lblPSU = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        hasilPSU = new javax.swing.JLabel();
        lblMonitor = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        hasilMonitor = new javax.swing.JLabel();
        lblDvd = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        hasilDvd = new javax.swing.JLabel();
        lblKMC = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        hasilKMC = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        hasilTotal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmbRam = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        cmbProc = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        cmbVga = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        cmbPsu = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        cmbDd = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        cmbMonitor = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        cmbDVD = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        cmbKMC = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);

        jLabel2.setText("Pilih Motherboard");

        cmbMotherboard.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "=Pilih=" }));
        cmbMotherboard.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbMotherboardItemStateChanged(evt);
            }
        });
        cmbMotherboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMotherboardActionPerformed(evt);
            }
        });
        cmbMotherboard.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cmbMotherboardPropertyChange(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Rp.");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("00");

        jLabel5.setText("Produk");

        lblMb.setText("Motherboard");

        jLabel6.setText("Harga");

        lblRam.setText("Ram");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Rp.");

        hasilRAM.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        hasilRAM.setText("00");

        lblProc.setText("Processor");

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel16.setText("Rp.");

        hasilProc.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        hasilProc.setText("00");

        lblHDD.setText("HDD/SSD");

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel17.setText("Rp.");

        hasilHDD.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        hasilHDD.setText("00");

        lblVGA.setText("VGA");

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel18.setText("Rp.");

        hasilVGA.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        hasilVGA.setText("00");

        lblPSU.setText("PSU");

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel19.setText("Rp.");

        hasilPSU.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        hasilPSU.setText("00");

        lblMonitor.setText("MONITOR");

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel20.setText("Rp.");

        hasilMonitor.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        hasilMonitor.setText("00");

        lblDvd.setText("DVD/CD ROM");

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel21.setText("Rp.");

        hasilDvd.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        hasilDvd.setText("00");

        lblKMC.setText("Case+Keyboard+Mouse");

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel22.setText("Rp.");

        hasilKMC.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        hasilKMC.setText("00");

        jLabel15.setText("GRAND TOTAL ");

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel23.setText("Rp.");

        hasilTotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        hasilTotal.setText("00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMb, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRam, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProc)
                    .addComponent(lblHDD)
                    .addComponent(lblVGA)
                    .addComponent(lblPSU)
                    .addComponent(lblMonitor)
                    .addComponent(lblDvd)
                    .addComponent(lblKMC)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hasilTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hasilRAM, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hasilProc, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hasilHDD, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hasilVGA, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hasilPSU, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hasilMonitor, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hasilDvd, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hasilKMC, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(168, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(12, 12, 12)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMb)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRam)
                    .addComponent(jLabel8)
                    .addComponent(hasilRAM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hasilProc)
                    .addComponent(jLabel16)
                    .addComponent(lblProc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hasilHDD)
                    .addComponent(jLabel17)
                    .addComponent(lblHDD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hasilVGA)
                    .addComponent(jLabel18)
                    .addComponent(lblVGA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hasilPSU)
                    .addComponent(jLabel19)
                    .addComponent(lblPSU))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hasilMonitor)
                    .addComponent(jLabel20)
                    .addComponent(lblMonitor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hasilDvd)
                    .addComponent(jLabel21)
                    .addComponent(lblDvd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hasilKMC)
                    .addComponent(jLabel22)
                    .addComponent(lblKMC))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23)
                        .addComponent(hasilTotal)))
                .addContainerGap(473, Short.MAX_VALUE))
        );

        jLabel1.setText("Pilih RAM");

        cmbRam.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "=Pilih=" }));
        cmbRam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRamActionPerformed(evt);
            }
        });

        jLabel7.setText("Pilih Processor");

        cmbProc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "=Pilih=" }));
        cmbProc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProcActionPerformed(evt);
            }
        });

        jLabel9.setText("Pilih VGA");

        cmbVga.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "=Pilih=" }));
        cmbVga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbVgaActionPerformed(evt);
            }
        });

        jLabel10.setText("Pilih PSU");

        cmbPsu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "=Pilih=" }));
        cmbPsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPsuActionPerformed(evt);
            }
        });

        jLabel11.setText("Pilih HDD/SSD");

        cmbDd.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "=Pilih=" }));
        cmbDd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDdActionPerformed(evt);
            }
        });

        jLabel12.setText("Pilih Monitor");

        cmbMonitor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "=Pilih=" }));
        cmbMonitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMonitorActionPerformed(evt);
            }
        });

        jLabel13.setText("Pilih DVD ROM");

        cmbDVD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "=Pilih=" }));
        cmbDVD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDVDActionPerformed(evt);
            }
        });

        jLabel14.setText("Casing + Keyboard + Mouse");

        cmbKMC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "=Pilih=" }));
        cmbKMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbKMCActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 255, 51));
        jButton1.setText("Rakit PC");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmbDd, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel7)
                                    .addComponent(cmbRam, 0, 250, Short.MAX_VALUE)
                                    .addComponent(cmbMotherboard, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbProc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabel11)))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9)
                            .addComponent(cmbVga, 0, 250, Short.MAX_VALUE)
                            .addComponent(jLabel10)
                            .addComponent(cmbPsu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12)
                            .addComponent(cmbMonitor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13)
                            .addComponent(cmbDVD, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cmbKMC, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbMotherboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbVga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbKMC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbProc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMonitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbDd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDVD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbMotherboardItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbMotherboardItemStateChanged
       
    }//GEN-LAST:event_cmbMotherboardItemStateChanged

    private void cmbMotherboardPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cmbMotherboardPropertyChange
        
    }//GEN-LAST:event_cmbMotherboardPropertyChange

    private void cmbMotherboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMotherboardActionPerformed
        if(cmbMotherboard.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Data Belum Lengkap");
        } else {
            conn = simanu.KoneksiDB.simanuDb();
            
            String cmbMb = (String) cmbMotherboard.getSelectedItem();
            String sql = "SELECT harga_mb, nama_mb FROM motherboard WHERE nama_mb='"+cmbMb+"'";
            
            try{
               stmt = conn.createStatement(); 
               rs = stmt.executeQuery(sql);
              
               while (rs.next()){
                    
                    int hargaMotherboard = rs.getInt("harga_mb");
                    
                    String namaMb = rs.getString("nama_mb");
                    jLabel3.setText(String.valueOf(hargaMotherboard));
                    lblMb.setText("1. "+namaMb);
               } 
               stmt.close();
               conn.close();
                //jLabel3.setText(cmbMb);
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_cmbMotherboardActionPerformed

    private void cmbRamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRamActionPerformed
        if(cmbRam.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Data Belum Lengkap");
        } else {
            conn = simanu.KoneksiDB.simanuDb();
            
            String cmbR = (String) cmbRam.getSelectedItem();
            String sql = "SELECT harga_ram, nama_ram, merek_ram FROM ram WHERE nama_ram='"+cmbR+"'";
            
            try{
               stmt = conn.createStatement(); 
               rs = stmt.executeQuery(sql);
              
               while (rs.next()){
                    int hargaRam = rs.getInt("harga_ram");
                    String namaRam = rs.getString("nama_ram");
                    hasilRAM.setText(String.valueOf(hargaRam));
                    lblRam.setText("2. "+namaRam);
               } 
               stmt.close();
               conn.close();
                //jLabel3.setText(cmbMb);
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_cmbRamActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmbVgaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbVgaActionPerformed
       if(cmbVga.getSelectedItem().equals("=Pilih=")){
            JOptionPane.showMessageDialog(rootPane, "Data Belum Lengkap");
        } else {
            conn = simanu.KoneksiDB.simanuDb();
            
            String cmbVGA = (String) cmbVga.getSelectedItem();
            String sql = "SELECT harga_vga, nama_vga, merek_vga FROM vga WHERE nama_vga='"+cmbVGA+"'";
            
            try{
               stmt = conn.createStatement(); 
               rs = stmt.executeQuery(sql);
              
               while (rs.next()){

                    int hargaVGA = rs.getInt("harga_vga");
                   
                    String namaX = rs.getString("nama_vga");
                    hasilVGA.setText(String.valueOf(hargaVGA));
                    lblVGA.setText("5. "+namaX);
               } 
               stmt.close();
               conn.close();
                //jLabel3.setText(cmbMb);
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_cmbVgaActionPerformed

    private void cmbProcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProcActionPerformed
       if(cmbProc.getSelectedItem().equals("=Pilih=")){
            JOptionPane.showMessageDialog(rootPane, "Data Belum Lengkap");
        } else {
            conn = simanu.KoneksiDB.simanuDb();
            
            String cmbP = (String) cmbProc.getSelectedItem();
            String sql = "SELECT harga_p, nama_p, merek_p FROM processor WHERE nama_p='"+cmbP+"'";
            
            try{
               stmt = conn.createStatement(); 
               rs = stmt.executeQuery(sql);
              
               while (rs.next()){
                    int hargaProc = rs.getInt("harga_p");
                    String namaX = rs.getString("nama_p");
                    hasilProc.setText(String.valueOf(hargaProc));
                    lblProc.setText("3. "+namaX);
               } 
               stmt.close();
               conn.close();
                
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_cmbProcActionPerformed

    private void cmbDdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDdActionPerformed
        if(cmbDd.getSelectedItem().equals("=Pilih=")){
            JOptionPane.showMessageDialog(rootPane, "Data Belum Lengkap");
        } else {
            conn = simanu.KoneksiDB.simanuDb();
            
            String cmbDD = (String) cmbDd.getSelectedItem();
            String sql = "SELECT harga_dd, nama_dd, merek_dd FROM diskdrive WHERE nama_dd='"+cmbDD+"'";
            
            try{
               stmt = conn.createStatement(); 
               rs = stmt.executeQuery(sql);
              
               while (rs.next()){
                    int hargaDD = rs.getInt("harga_dd");
                    String namaX = rs.getString("nama_dd");
                    hasilHDD.setText(String.valueOf(hargaDD));
                    lblHDD.setText("4. "+namaX);
               } 
               stmt.close();
               conn.close();
                
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_cmbDdActionPerformed

    private void cmbPsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPsuActionPerformed
       if(cmbPsu.getSelectedItem().equals("=Pilih=")){
            JOptionPane.showMessageDialog(rootPane, "Data Belum Lengkap");
        } else {
            conn = simanu.KoneksiDB.simanuDb();
            
            String cmbPSU = (String) cmbPsu.getSelectedItem();
            String sql = "SELECT harga_psu, nama_psu, merek_psu FROM psu WHERE nama_psu='"+cmbPSU+"'";
            
            try{
               stmt = conn.createStatement(); 
               rs = stmt.executeQuery(sql);
              
               while (rs.next()){
                    int hargaPSU = rs.getInt("harga_psu");
                    String namaX = rs.getString("nama_psu");
                    hasilPSU.setText(String.valueOf(hargaPSU));
                    lblPSU.setText("6. "+namaX);
               } 
               stmt.close();
               conn.close();
                
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_cmbPsuActionPerformed

    private void cmbMonitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMonitorActionPerformed
        if(cmbMonitor.getSelectedItem().equals("=Pilih=")){
            JOptionPane.showMessageDialog(rootPane, "Data Belum Lengkap");
        } else {
            conn = simanu.KoneksiDB.simanuDb();
            
            String cmbMNT = (String) cmbMonitor.getSelectedItem();
            String sql = "SELECT harga_mnt, nama_mnt, merek_mnt FROM monitor WHERE nama_mnt='"+cmbMNT+"'";
            
            try{
               stmt = conn.createStatement(); 
               rs = stmt.executeQuery(sql);
              
               while (rs.next()){
                    int hargaMonitor = rs.getInt("harga_mnt");
                    String namaX = rs.getString("nama_mnt");
                    hasilMonitor.setText(String.valueOf(hargaMonitor));
                    lblMonitor.setText("7. "+namaX);
               } 
               stmt.close();
               conn.close();
                
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_cmbMonitorActionPerformed

    private void cmbDVDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDVDActionPerformed
       if(cmbDVD.getSelectedItem().equals("=Pilih=")){
            JOptionPane.showMessageDialog(rootPane, "Data Belum Lengkap");
        } else {
            conn = simanu.KoneksiDB.simanuDb();
            
            String cmbD = (String) cmbDVD.getSelectedItem();
            String sql = "SELECT harga_dvdrom, nama_dvdrom, merek_dvdrom FROM dvdrom WHERE nama_dvdrom='"+cmbD+"'";
            
            try{
               stmt = conn.createStatement(); 
               rs = stmt.executeQuery(sql);
              
               while (rs.next()){
                    int hargaDVD = rs.getInt("harga_dvdrom");
                    String namaX = rs.getString("nama_dvdrom");
                    hasilDvd.setText(String.valueOf(hargaDVD));
                    lblDvd.setText("8. "+namaX);
               } 
               
               stmt.close();
               conn.close();
                
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_cmbDVDActionPerformed

    private void cmbKMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbKMCActionPerformed
        if(cmbKMC.getSelectedItem().equals("=Pilih=")){
            cmbMotherboard.setEnabled(true);
            cmbRam.setEnabled(true);
            cmbProc.setEnabled(true);
            cmbDd.setEnabled(true);
            cmbVga.setEnabled(true);
            cmbPsu.setEnabled(true);
            cmbMonitor.setEnabled(true);
            cmbDVD.setEnabled(true);
        } else {
            conn = simanu.KoneksiDB.simanuDb();
            
            String cmbK = (String) cmbKMC.getSelectedItem();
            String sql = "SELECT harga_kmc, nama_kmc FROM keymosecase WHERE nama_kmc='"+cmbK+"'";
            
            try{
               stmt = conn.createStatement(); 
               rs = stmt.executeQuery(sql);
              
               while (rs.next()){
                    int hargaKMC = rs.getInt("harga_kmc");
                    String namaX = rs.getString("nama_kmc");
                    hasilKMC.setText(String.valueOf(hargaKMC));
                    lblKMC.setText("9. "+namaX);
               } 
               stmt.close();
               conn.close();
               NumberFormat numberFormatter = new DecimalFormat("#,###,###");
               String formattedNumber = numberFormatter.format(10000000);
               int HgMb = Integer.parseInt(jLabel3.getText());
               int HgRam = Integer.parseInt(hasilRAM.getText());
               int HgDVD = Integer.parseInt(hasilDvd.getText());
               int HgKMC = Integer.parseInt(hasilKMC.getText());
               int HgProc = Integer.parseInt(hasilProc.getText());
               int HgHdd = Integer.parseInt(hasilHDD.getText());
               int HgVga = Integer.parseInt(hasilVGA.getText());
               int HgPsu = Integer.parseInt(hasilPSU.getText());
               int HgMonitor = Integer.parseInt(hasilMonitor.getText());
               cmbMotherboard.setEnabled(false);
               cmbRam.setEnabled(false);
               cmbProc.setEnabled(false);
               cmbDd.setEnabled(false);
               cmbVga.setEnabled(false);
               cmbPsu.setEnabled(false);
               cmbMonitor.setEnabled(false);
               cmbDVD.setEnabled(false);
               int GranD = HgDVD+HgKMC+HgMb+HgRam+HgProc+HgHdd+HgVga+HgPsu+HgMonitor;
               
               
               hasilTotal.setText(String.valueOf(GranD));
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        
    }//GEN-LAST:event_cmbKMCActionPerformed
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            Connection conn = null;
            Statement stmt = null;
            if(cmbMotherboard.getSelectedItem().equals("=Pilih=") ||
                    cmbRam.getSelectedItem().equals("=Pilih=") ||
                    cmbProc.getSelectedItem().equals("=Pilih=") ||
                    cmbDd.getSelectedItem().equals("=Pilih=")||
                    cmbVga.getSelectedItem().equals("=Pilih=")||
                    cmbPsu.getSelectedItem().equals("=Pilih=")||
                    cmbMonitor.getSelectedItem().equals("=Pilih=")||
                    cmbDVD.getSelectedItem().equals("=Pilih=")||
                    cmbKMC.getSelectedItem().equals("=Pilih=")){
                        JOptionPane.showMessageDialog(rootPane, "Data Belum Lengkap");
            } else {
              Object cMboard = cmbMotherboard.getSelectedItem();
              Object cRam = cmbRam.getSelectedItem();
              Object cProc = cmbProc.getSelectedItem();
              Object cDd = cmbDd.getSelectedItem();
              Object cV = cmbVga.getSelectedItem();
              Object cPS = cmbPsu.getSelectedItem();
              Object cMNT = cmbMonitor.getSelectedItem();
              Object cDVD = cmbDVD.getSelectedItem();
              Object cKMC = cmbKMC.getSelectedItem();
              int totalOkay =Integer.parseInt(hasilTotal.getText());
              try{
                  conn = simanu.KoneksiDB.simanuDb();
                  stmt = conn.createStatement();
                  stmt.executeUpdate("insert into invoice(mb,ram,proc,Disk,vga,psu,mnt,dvd,kmc,grandTotal) values('"+cMboard+"','"+cRam+"','"+cProc+"','"+cDd+"','"+cV+"','"+cPS+"','"+cMNT+"','"+cDVD+"','"+cKMC+"','"+totalOkay+"')");  
                  JOptionPane.showMessageDialog(rootPane,"Data berhasil ditambahkan");
              }catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
              }
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbDVD;
    private javax.swing.JComboBox cmbDd;
    private javax.swing.JComboBox cmbKMC;
    private javax.swing.JComboBox cmbMonitor;
    private javax.swing.JComboBox cmbMotherboard;
    private javax.swing.JComboBox cmbProc;
    private javax.swing.JComboBox cmbPsu;
    private javax.swing.JComboBox cmbRam;
    private javax.swing.JComboBox cmbVga;
    private javax.swing.JLabel hasilDvd;
    private javax.swing.JLabel hasilHDD;
    private javax.swing.JLabel hasilKMC;
    private javax.swing.JLabel hasilMonitor;
    private javax.swing.JLabel hasilPSU;
    private javax.swing.JLabel hasilProc;
    private javax.swing.JLabel hasilRAM;
    private javax.swing.JLabel hasilTotal;
    private javax.swing.JLabel hasilVGA;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDvd;
    private javax.swing.JLabel lblHDD;
    private javax.swing.JLabel lblKMC;
    private javax.swing.JLabel lblMb;
    private javax.swing.JLabel lblMonitor;
    private javax.swing.JLabel lblPSU;
    private javax.swing.JLabel lblProc;
    private javax.swing.JLabel lblRam;
    private javax.swing.JLabel lblVGA;
    // End of variables declaration//GEN-END:variables
}
