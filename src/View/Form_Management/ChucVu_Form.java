/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.Form_Management;

import Model.SachFake;
import View.ButtonDesign.Button;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author quanc
 */
public class ChucVu_Form extends javax.swing.JPanel {

    private List<SachFake> listS = new ArrayList<>();
    public ChucVu_Form() {
        initComponents();
         String columns[] = {"Mã", "Tên Sách", "Hình", "Số lượng", "Giá bán", "Barcode", "Mô Tả"};
        Object rows[][] = {};
        this.table1.setModel(new DefaultTableModel(rows, columns));
        table1.setDefaultEditor(Object.class, null);
        table1.setBackground(Color.WHITE);
        this.table1.setRowHeight(50);
        this.table1.setBackground(Color.white);
        initTableData();
    }
    public void initTableData() {
        // Nơi đổ dữ liệu vào table
        // Ví dụ về đối tượng SachFake khi add Row ( sẽ tùy vào đối tượng để sửa các trường
        //new ModelTest(new ImageIcon("image/bookmark_30px.png"), "Bora", "Male", "C#", 300).toRowTable()
        //new Object[]{new ModelProfile(icon, name), Ma, soLuong, df.format(giaBan), barCode, moTa}
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("image/dacnhantam.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
//        this.table1.addRow(new SachFake("SKL1", imageIcon, "Sách 1", 100, 30000, "01293123", "Mới vl").toRowTable());
        
        for (int i = 0; i <= 160; i++) {
            listS.add(new SachFake("SKL1", imageIcon, "Sách " + i, 100, 30000, "01293123", "Mới vl"));
        }
        for (SachFake sach : listS) {
            table1.addRow(sach.toRowTable());
        }
        
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
        table1 = new View.DesignComponent.Table();
        btnInBaoCao = new View.ButtonDesign.Button();
        btnInBaoCao2 = new View.ButtonDesign.Button();
        combobox1 = new View.DesignComponent.Combobox();
        jPanelBourder1 = new View.DesignComponent.JPanelBourder();
        jLabel1 = new javax.swing.JLabel();
        textField1 = new View.DesignComponent.TextField();
        pagePanel = new javax.swing.JPanel();
        txtTen = new View.DesignComponent.TextField();
        txtTen1 = new View.DesignComponent.TextField();
        txtTen3 = new View.DesignComponent.TextField();
        txtTen9 = new View.DesignComponent.TextField();
        btnInBaoCao1 = new View.ButtonDesign.Button();
        btnInBaoCao3 = new View.ButtonDesign.Button();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(452, 395));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jScrollPane1.setViewportView(table1);

        btnInBaoCao.setBackground(new java.awt.Color(31, 31, 111));
        btnInBaoCao.setBorder(javax.swing.BorderFactory.createEmptyBorder(-3, 1, 1, 1));
        btnInBaoCao.setForeground(new java.awt.Color(255, 255, 255));
        btnInBaoCao.setText("Export Excel");
        btnInBaoCao.setFocusable(false);
        btnInBaoCao.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnInBaoCao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInBaoCaoActionPerformed(evt);
            }
        });

        btnInBaoCao2.setBackground(new java.awt.Color(31, 31, 111));
        btnInBaoCao2.setBorder(javax.swing.BorderFactory.createEmptyBorder(-3, 1, 1, 1));
        btnInBaoCao2.setForeground(new java.awt.Color(255, 255, 255));
        btnInBaoCao2.setText("Import Excel");
        btnInBaoCao2.setFocusable(false);
        btnInBaoCao2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnInBaoCao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInBaoCao2ActionPerformed(evt);
            }
        });

        combobox1.setMaximumRowCount(10);
        combobox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item1", "Item2", "Item3", "Item1", "Item2", "Item3", "Item1", "Item2", "Item3" }));
        combobox1.setSelectedIndex(-1);
        combobox1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        combobox1.setLabeText("Sắp A - Z");
        combobox1.setLineColor(new java.awt.Color(31, 31, 111));

        jPanelBourder1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBourder1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\quanc\\Downloads\\search_30px.png")); // NOI18N
        jPanelBourder1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 30, 40));

        textField1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textField1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        textField1.setLabelText("Tìm Kiếm Theo Tên");
        textField1.setLineColor(new java.awt.Color(31, 31, 111));
        textField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textField1KeyReleased(evt);
            }
        });
        jPanelBourder1.add(textField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 0, 290, 50));

        pagePanel.setBackground(new java.awt.Color(255, 255, 255));
        pagePanel.setLayout(new java.awt.GridLayout(1, 0));

        txtTen.setText("None");
        txtTen.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTen.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtTen.setLabelText("ID");
        txtTen.setLineColor(new java.awt.Color(31, 31, 111));
        txtTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenActionPerformed(evt);
            }
        });

        txtTen1.setText("None");
        txtTen1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTen1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtTen1.setLabelText("Mã Chức Vụ");
        txtTen1.setLineColor(new java.awt.Color(31, 31, 111));

        txtTen3.setText("None");
        txtTen3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTen3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtTen3.setLabelText("Mô Tả");
        txtTen3.setLineColor(new java.awt.Color(31, 31, 111));

        txtTen9.setText("None");
        txtTen9.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTen9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtTen9.setLabelText("Tên Chức Vụ");
        txtTen9.setLineColor(new java.awt.Color(31, 31, 111));

        btnInBaoCao1.setBackground(new java.awt.Color(31, 31, 111));
        btnInBaoCao1.setBorder(javax.swing.BorderFactory.createEmptyBorder(-3, 1, 1, 1));
        btnInBaoCao1.setForeground(new java.awt.Color(255, 255, 255));
        btnInBaoCao1.setText("Sửa");
        btnInBaoCao1.setFocusable(false);
        btnInBaoCao1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnInBaoCao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInBaoCao1ActionPerformed(evt);
            }
        });

        btnInBaoCao3.setBackground(new java.awt.Color(31, 31, 111));
        btnInBaoCao3.setBorder(javax.swing.BorderFactory.createEmptyBorder(-3, 1, 1, 1));
        btnInBaoCao3.setForeground(new java.awt.Color(255, 255, 255));
        btnInBaoCao3.setText("Thêm");
        btnInBaoCao3.setFocusable(false);
        btnInBaoCao3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnInBaoCao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInBaoCao3ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 27)); // NOI18N
        jLabel2.setText("Quản Lý Chức Vụ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelBourder1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(597, 597, 597))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnInBaoCao1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnInBaoCao3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnInBaoCao2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnInBaoCao, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtTen9, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(51, 51, 51)
                                    .addComponent(txtTen3, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(51, 51, 51)
                                    .addComponent(txtTen1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(155, 155, 155)
                        .addComponent(combobox1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(pagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTen9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTen3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInBaoCao1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInBaoCao3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInBaoCao2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInBaoCao, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(jPanelBourder1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtTen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(combobox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(pagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnInBaoCaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInBaoCaoActionPerformed

    }//GEN-LAST:event_btnInBaoCaoActionPerformed

    private void btnInBaoCao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInBaoCao2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInBaoCao2ActionPerformed

    private void textField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_textField1KeyReleased

    private void txtTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenActionPerformed

    }//GEN-LAST:event_txtTenActionPerformed

    private void btnInBaoCao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInBaoCao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInBaoCao1ActionPerformed

    private void btnInBaoCao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInBaoCao3ActionPerformed

    }//GEN-LAST:event_btnInBaoCao3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private View.ButtonDesign.Button btnInBaoCao;
    private View.ButtonDesign.Button btnInBaoCao1;
    private View.ButtonDesign.Button btnInBaoCao2;
    private View.ButtonDesign.Button btnInBaoCao3;
    private View.DesignComponent.Combobox combobox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private View.DesignComponent.JPanelBourder jPanelBourder1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pagePanel;
    private View.DesignComponent.Table table1;
    private View.DesignComponent.TextField textField1;
    private View.DesignComponent.TextField txtTen;
    private View.DesignComponent.TextField txtTen1;
    private View.DesignComponent.TextField txtTen3;
    private View.DesignComponent.TextField txtTen9;
    // End of variables declaration//GEN-END:variables
}
