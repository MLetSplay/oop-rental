/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.sql.*;
import code.Koneksi;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author M13
 */
public class Rental extends javax.swing.JFrame {

    /**
     * Creates new form Rental
     */
    public Rental() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        homePanel = new javax.swing.JPanel();
        dataPelangganPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        testTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        cariPelangganButton = new javax.swing.JButton();
        cariPelangganField = new javax.swing.JTextField();
        hapusPelangganButton = new javax.swing.JButton();
        hapusPelangganField = new javax.swing.JTextField();
        namaPelangganLabel = new javax.swing.JLabel();
        namaPelangganField = new javax.swing.JTextField();
        alamatLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        alamatTextArea = new javax.swing.JTextArea();
        cpLabel = new javax.swing.JLabel();
        cpField = new javax.swing.JTextField();
        simpanPelangganButton = new javax.swing.JButton();
        baruPelangganButton = new javax.swing.JButton();
        batalPelangganButton = new javax.swing.JButton();
        ubahPelangganButton = new javax.swing.JButton();
        ubahPelangganField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 522, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Home", homePanel);

        dataPelangganPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                dataPelangganPanelComponentShown(evt);
            }
        });

        testTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nama", "Alamat", "Contact Person"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        testTable.setToolTipText("");
        jScrollPane1.setViewportView(testTable);
        if (testTable.getColumnModel().getColumnCount() > 0) {
            testTable.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        cariPelangganButton.setText("Cari (Nama)");
        cariPelangganButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariPelangganButtonActionPerformed(evt);
            }
        });

        hapusPelangganButton.setText("Hapus (ID)");
        hapusPelangganButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusPelangganButtonActionPerformed(evt);
            }
        });

        namaPelangganLabel.setText("Nama:");

        alamatLabel.setText("Alamat:");

        alamatTextArea.setColumns(20);
        alamatTextArea.setRows(5);
        jScrollPane2.setViewportView(alamatTextArea);

        cpLabel.setText("Contact Person:");

        simpanPelangganButton.setText("Simpan");
        simpanPelangganButton.setEnabled(false);
        simpanPelangganButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanPelangganButtonActionPerformed(evt);
            }
        });

        baruPelangganButton.setText("Baru");
        baruPelangganButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baruPelangganButtonActionPerformed(evt);
            }
        });

        batalPelangganButton.setText("Batal");
        batalPelangganButton.setEnabled(false);
        batalPelangganButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalPelangganButtonActionPerformed(evt);
            }
        });

        ubahPelangganButton.setText("Ubah (ID)");
        ubahPelangganButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahPelangganButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(baruPelangganButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(simpanPelangganButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(batalPelangganButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alamatLabel)
                            .addComponent(namaPelangganLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpLabel))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(namaPelangganField)
                            .addComponent(cpField))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ubahPelangganButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hapusPelangganButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cariPelangganButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(hapusPelangganField)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cariPelangganField, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ubahPelangganField, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaPelangganLabel)
                    .addComponent(namaPelangganField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alamatLabel)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpLabel)
                    .addComponent(cpField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpanPelangganButton)
                    .addComponent(baruPelangganButton)
                    .addComponent(batalPelangganButton))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ubahPelangganButton)
                    .addComponent(ubahPelangganField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cariPelangganButton)
                    .addComponent(cariPelangganField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hapusPelangganButton)
                    .addComponent(hapusPelangganField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout dataPelangganPanelLayout = new javax.swing.GroupLayout(dataPelangganPanel);
        dataPelangganPanel.setLayout(dataPelangganPanelLayout);
        dataPelangganPanelLayout.setHorizontalGroup(
            dataPelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataPelangganPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dataPelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        dataPelangganPanelLayout.setVerticalGroup(
            dataPelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataPelangganPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Data Pelanggan", dataPelangganPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void dataPelangganPanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_dataPelangganPanelComponentShown
        showPelanggan();
    }//GEN-LAST:event_dataPelangganPanelComponentShown

    private void hapusPelangganButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusPelangganButtonActionPerformed
        String query = hapusPelangganField.getText();
        try {
            Koneksi conn = new Koneksi();
            conn.query("DELETE FROM pelanggan WHERE pelanggan_id = '" + query + "'");
        } catch (Exception e){}
        refreshPelanggan();
        showPelanggan();
    }//GEN-LAST:event_hapusPelangganButtonActionPerformed

    private void cariPelangganButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariPelangganButtonActionPerformed
        refreshPelanggan();
        String query = cariPelangganField.getText();
        int baris = 0;
        try {
            Koneksi conn = new Koneksi();
            ResultSet rs = null;
            rs = conn.getData("SELECT * FROM pelanggan WHERE nama LIKE '%" + query + "%'");

            while (rs.next()){
                testTable.setValueAt(rs.getString("pelanggan_id"), baris, 0);
                testTable.setValueAt(rs.getString("nama"), baris, 1);
                testTable.setValueAt(rs.getString("alamat"), baris, 2);
                testTable.setValueAt(rs.getString("cp"), baris, 3);
                baris++;
            }
        } catch (SQLException e){}
    }//GEN-LAST:event_cariPelangganButtonActionPerformed

    private void simpanPelangganButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanPelangganButtonActionPerformed
        try {
            Koneksi conn = new Koneksi();
            if (ubahPelangganField.getText().equals("")){
                conn.query("INSERT INTO pelanggan (nama, alamat, cp) VALUES ('"+namaPelangganField.getText()+"','"+alamatTextArea.getText()+"','"+cpField.getText()+"')");
            } else{
                conn.query("UPDATE pelanggan SET nama='"+namaPelangganField.getText()+"', alamat='"+alamatTextArea.getText()+"', cp='"+cpField.getText()+"' WHERE pelanggan_id='"+ubahPelangganField.getText()+"'");
            }
        } catch (Exception e){}
        namaPelangganField.setText("");
        namaPelangganField.setEnabled(false);
        alamatTextArea.setText("");
        alamatTextArea.setEnabled(false);
        cpField.setText("");
        cpField.setEnabled(false);
        simpanPelangganButton.setEnabled(false);
        batalPelangganButton.setEnabled(false);
        baruPelangganButton.setEnabled(true);
        ubahPelangganButton.setEnabled(true);
        ubahPelangganField.setText("");
        ubahPelangganField.setEnabled(true);
        refreshPelanggan();
        showPelanggan();
    }//GEN-LAST:event_simpanPelangganButtonActionPerformed

    private void baruPelangganButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baruPelangganButtonActionPerformed
        namaPelangganField.setEnabled(true);
        alamatTextArea.setEnabled(true);
        cpField.setEnabled(true);
        simpanPelangganButton.setEnabled(true);
        batalPelangganButton.setEnabled(true);
        baruPelangganButton.setEnabled(false);
        ubahPelangganButton.setEnabled(false);
        ubahPelangganField.setText("");
        ubahPelangganField.setEnabled(false);
    }//GEN-LAST:event_baruPelangganButtonActionPerformed

    private void batalPelangganButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalPelangganButtonActionPerformed
        namaPelangganField.setText("");
        namaPelangganField.setEnabled(false);
        alamatTextArea.setText("");
        alamatTextArea.setEnabled(false);
        cpField.setText("");
        cpField.setEnabled(false);
        simpanPelangganButton.setEnabled(false);
        batalPelangganButton.setEnabled(false);
        baruPelangganButton.setEnabled(true);
        ubahPelangganButton.setEnabled(true);
        ubahPelangganField.setEnabled(true);
    }//GEN-LAST:event_batalPelangganButtonActionPerformed

    private void ubahPelangganButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahPelangganButtonActionPerformed
        if (!ubahPelangganField.getText().equals("")){
            String id = ubahPelangganField.getText();
            ResultSet rs = null;
            try{
                Koneksi conn = new Koneksi();
                rs = conn.getData("SELECT * FROM pelanggan WHERE pelanggan_id='"+id+"'");
                
                while (rs.next()){
                    namaPelangganField.setText(rs.getString("nama"));
                    alamatTextArea.setText(rs.getString("alamat"));
                    cpField.setText(rs.getString("cp"));
                }
            } catch (SQLException e) {}
            namaPelangganField.setEnabled(true);
            alamatTextArea.setEnabled(true);
            cpField.setEnabled(true);
            simpanPelangganButton.setEnabled(true);
            batalPelangganButton.setEnabled(true);
            baruPelangganButton.setEnabled(false);
            ubahPelangganButton.setEnabled(false);
            ubahPelangganField.setEnabled(false);
        }
    }//GEN-LAST:event_ubahPelangganButtonActionPerformed
    
    private void refreshPelanggan(){
        DefaultTableModel model = new DefaultTableModel(null, new String [] {"ID", "Nama", "Alamat", "Contact Person"});
        model.setRowCount(10);
        testTable.setModel(model);
    }
    
    private void showPelanggan(){
        int baris = 0;
        try {
            Koneksi conn = new Koneksi();
            ResultSet rs = null;
            rs = conn.getData("SELECT * FROM pelanggan");

            while (rs.next()){
                testTable.setValueAt(rs.getString("pelanggan_id"), baris, 0);
                testTable.setValueAt(rs.getString("nama"), baris, 1);
                testTable.setValueAt(rs.getString("alamat"), baris, 2);
                testTable.setValueAt(rs.getString("cp"), baris, 3);
                baris++;
            }
        } catch (SQLException e){}
    }
    
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
            java.util.logging.Logger.getLogger(Rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rental().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alamatLabel;
    private javax.swing.JTextArea alamatTextArea;
    private javax.swing.JButton baruPelangganButton;
    private javax.swing.JButton batalPelangganButton;
    private javax.swing.JButton cariPelangganButton;
    private javax.swing.JTextField cariPelangganField;
    private javax.swing.JTextField cpField;
    private javax.swing.JLabel cpLabel;
    private javax.swing.JPanel dataPelangganPanel;
    private javax.swing.JButton hapusPelangganButton;
    private javax.swing.JTextField hapusPelangganField;
    private javax.swing.JPanel homePanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField namaPelangganField;
    private javax.swing.JLabel namaPelangganLabel;
    private javax.swing.JButton simpanPelangganButton;
    private javax.swing.JTable testTable;
    private javax.swing.JButton ubahPelangganButton;
    private javax.swing.JTextField ubahPelangganField;
    // End of variables declaration//GEN-END:variables
}
