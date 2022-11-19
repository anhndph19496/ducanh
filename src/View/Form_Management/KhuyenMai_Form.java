/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.Form_Management;

import Model.SachFake;
import View.ButtonDesign.Button;
import java.awt.Color;
import java.awt.Image;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.KhuyenMai;
import service.IKhuyenMaiServicer;
import service.impl.KhuyenMaiServicer;

/**
 *
 * @author quanc
 */
public class KhuyenMai_Form extends javax.swing.JPanel {

//    private List<SachFake> listS = new ArrayList<>();
    private List<Button> listBtn = new ArrayList<>();
    private List<KhuyenMai> listKm = new ArrayList<>();
    private IKhuyenMaiServicer iKhuyenMaiServicer;

    public KhuyenMai_Form() {
        initComponents();
        iKhuyenMaiServicer = new KhuyenMaiServicer();
        String columns[] = {"Id", "Ma", "Tên KM", "Chiết Khấu", "Ngày Bắt Đầu", "Ngày Kết Thúc", "Trạng Thái", "Mô Tả"};
        Object rows[][] = {};

        this.tbKhuyenMai.setModel(new DefaultTableModel(rows, columns));
        tbKhuyenMai.setDefaultEditor(Object.class, null);
        tbKhuyenMai.setBackground(Color.WHITE);
        this.tbKhuyenMai.setRowHeight(50);
        this.tbKhuyenMai.setBackground(Color.white);
//        initTableData();

        initTableData();
    }

    private void initTableData() {
        listKm = iKhuyenMaiServicer.selectAll();
        DefaultTableModel dtm = (DefaultTableModel) tbKhuyenMai.getModel();
        dtm.setRowCount(0);
        for (KhuyenMai km : listKm) {
            dtm.addRow(km.toDaTaRow());
        }

    }

    private void fillTable(int row) {
        KhuyenMai km = listKm.get(row);
        txtId.setText(km.getId());
        txtMaKM.setText(km.getMa());
        txtTenKM.setText(km.getTen());
        txtChietKhau.setText(String.valueOf(km.getChietKhau()));
        txtNgayBD.setText(String.valueOf(km.getNgayBatDau()));
        txtNgayKT.setText(String.valueOf(km.getNgayKetThuc()));
        cbTrangThai.setSelectedItem(km.getTrangThai() == 1 ? "Dang hoat dong" : "Khong hoat dong");
        txtMoTa.setText(km.getMoTa());
    }
//    public void initTableData() {
//        // Nơi đổ dữ liệu vào table
//        // Ví dụ về đối tượng SachFake khi add Row ( sẽ tùy vào đối tượng để sửa các trường
//        //new ModelTest(new ImageIcon("image/bookmark_30px.png"), "Bora", "Male", "C#", 300).toRowTable()
//        //new Object[]{new ModelProfile(icon, name), Ma, soLuong, df.format(giaBan), barCode, moTa}
//        ImageIcon imageIcon = new ImageIcon(new ImageIcon("image/dacnhantam.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
////        this.table1.addRow(new SachFake("SKL1", imageIcon, "Sách 1", 100, 30000, "01293123", "Mới vl").toRowTable());
//
//        for (int i = 0; i <= 160; i++) {
//            listS.add(new SachFake("SKL1", imageIcon, "Sách " + i, 100, 30000, "01293123", "Mới vl"));
//        }
//        for (SachFake sach : listS) {
//            table1.addRow(sach.toRowTable());
//        }
//
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbKhuyenMai = new View.DesignComponent.Table();
        btnInBaoCao = new View.ButtonDesign.Button();
        btnInBaoCao2 = new View.ButtonDesign.Button();
        combobox1 = new View.DesignComponent.Combobox();
        jPanelBourder1 = new View.DesignComponent.JPanelBourder();
        jLabel1 = new javax.swing.JLabel();
        textField1 = new View.DesignComponent.TextField();
        pagePanel = new javax.swing.JPanel();
        txtId = new View.DesignComponent.TextField();
        txtMaKM = new View.DesignComponent.TextField();
        txtChietKhau = new View.DesignComponent.TextField();
        txtTenKM = new View.DesignComponent.TextField();
        btnInBaoCao1 = new View.ButtonDesign.Button();
        btnInBaoCao3 = new View.ButtonDesign.Button();
        jLabel2 = new javax.swing.JLabel();
        txtNgayBD = new View.DesignComponent.TextField();
        txtNgayKT = new View.DesignComponent.TextField();
        cbTrangThai = new View.DesignComponent.Combobox();
        txtMoTa = new View.DesignComponent.TextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(452, 395));

        tbKhuyenMai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbKhuyenMai.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        tbKhuyenMai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbKhuyenMaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbKhuyenMai);

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

        txtId.setText("None");
        txtId.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtId.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtId.setLabelText("ID");
        txtId.setLineColor(new java.awt.Color(31, 31, 111));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        txtMaKM.setText("None");
        txtMaKM.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtMaKM.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtMaKM.setLabelText("Mã Khuyến Mại");
        txtMaKM.setLineColor(new java.awt.Color(31, 31, 111));

        txtChietKhau.setText("None");
        txtChietKhau.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtChietKhau.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtChietKhau.setLabelText("Chiết Khấu");
        txtChietKhau.setLineColor(new java.awt.Color(31, 31, 111));

        txtTenKM.setText("None");
        txtTenKM.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTenKM.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtTenKM.setLabelText("Tên Khuyến Mại");
        txtTenKM.setLineColor(new java.awt.Color(31, 31, 111));

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
        jLabel2.setText("Quản Lý Khuyến Mãi");

        txtNgayBD.setText("None");
        txtNgayBD.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNgayBD.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtNgayBD.setLabelText("Ngày Bắt Đầu");
        txtNgayBD.setLineColor(new java.awt.Color(31, 31, 111));

        txtNgayKT.setText("None");
        txtNgayKT.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNgayKT.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtNgayKT.setLabelText("Ngày Kết Thúc");
        txtNgayKT.setLineColor(new java.awt.Color(31, 31, 111));

        cbTrangThai.setMaximumRowCount(10);
        cbTrangThai.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dang hoat dong", "Khong hoat dong" }));
        cbTrangThai.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        cbTrangThai.setLabeText("Trạng Thái");
        cbTrangThai.setLineColor(new java.awt.Color(31, 31, 111));
        cbTrangThai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTrangThaiActionPerformed(evt);
            }
        });

        txtMoTa.setText("None");
        txtMoTa.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtMoTa.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtMoTa.setLabelText("Mô Tả");
        txtMoTa.setLineColor(new java.awt.Color(31, 31, 111));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(pagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtTenKM, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(51, 51, 51)
                                    .addComponent(txtChietKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(51, 51, 51)
                                    .addComponent(txtMaKM, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelBourder1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(combobox1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnInBaoCao1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnInBaoCao3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnInBaoCao2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnInBaoCao, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(462, 462, 462))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtChietKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtMaKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInBaoCao1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInBaoCao3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInBaoCao2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInBaoCao, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelBourder1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(pagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(combobox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed

    }//GEN-LAST:event_txtIdActionPerformed

    private void btnInBaoCao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInBaoCao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInBaoCao1ActionPerformed

    private void btnInBaoCao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInBaoCao3ActionPerformed
//        try {
//            KhuyenMai km = this.getDaTa();
//            if (km == null) {
//                return;
//            } else {
//                listKm.add(km);
//                initTableData();
//            }
//        } catch (ParseException ex) {
//            
//            System.out.println("loi");
//        }

        KhuyenMai km = new KhuyenMai();
        km.setMa(txtMaKM.getText().trim());
        km.setTen(txtTenKM.getText().trim());
        km.setChietKhau(Integer.parseInt(txtChietKhau.getText().trim()));
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        try {
            km.setNgayBatDau(df.parse(txtNgayBD.getText().trim()));
            km.setNgayKetThuc(df.parse(txtNgayKT.getText().trim()));
        } catch (ParseException ex) {
            Logger.getLogger(KhuyenMai_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (cbTrangThai.getSelectedItem().equals("Dang hoat dong")) {
            km.setTrangThai(1);
        } else {
            km.setTrangThai(0);
        }
        km.setMa(txtMoTa.getText().trim());

        iKhuyenMaiServicer.insert(km);
        initTableData();


    }//GEN-LAST:event_btnInBaoCao3ActionPerformed

    private void tbKhuyenMaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbKhuyenMaiMouseClicked
        // TODO add your handling code here:
        int row = tbKhuyenMai.getSelectedRow();
        fillTable(row);
    }//GEN-LAST:event_tbKhuyenMaiMouseClicked

    private void cbTrangThaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTrangThaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTrangThaiActionPerformed

//    private KhuyenMai getDaTa() throws ParseException {
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//        String ma = txtMaKM.getText().trim();
//        String ten = txtTenKM.getText().trim();
//        String chietKhau = txtChietKhau.getText().trim();
//        String ngayBD = txtNgayBD.getText().trim();
//        String ngayKT = txtNgayKT.getText().trim();
//        int trangThai = cbTrangThai.getSelectedIndex();
//        if (String.valueOf(trangThai).equals("Dang hoat dong")) {
//            cbTrangThai.setSelectedItem(1);
//        } else {
//            cbTrangThai.setSelectedItem(0);
//        }
////        if (trangThai.equals("Dang hoat dong")) {
////            cbTrangThai.setSelectedIndex(1);
////        } else {
////            cbTrangThai.setSelectedIndex(0);
////        }
////        int trang = Integer.parseInt(trangThai);
//        String moTa = txtMoTa.getText().trim();
//        if (ma.isEmpty() || ten.isEmpty() || chietKhau.isEmpty() || ngayBD.isEmpty() || ngayKT.isEmpty() || moTa.isEmpty()) {
//            JOptionPane.showMessageDialog(this, "ko dc de trong");
//            return null;
//        }
//        
//        KhuyenMai km = new KhuyenMai(ma, ten, Integer.parseInt(chietKhau), df.parse(ngayBD), df.parse(ngayKT), trangThai, moTa);
//        return km;
//        
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private View.ButtonDesign.Button btnInBaoCao;
    private View.ButtonDesign.Button btnInBaoCao1;
    private View.ButtonDesign.Button btnInBaoCao2;
    private View.ButtonDesign.Button btnInBaoCao3;
    private View.DesignComponent.Combobox cbTrangThai;
    private View.DesignComponent.Combobox combobox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private View.DesignComponent.JPanelBourder jPanelBourder1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pagePanel;
    private View.DesignComponent.Table tbKhuyenMai;
    private View.DesignComponent.TextField textField1;
    private View.DesignComponent.TextField txtChietKhau;
    private View.DesignComponent.TextField txtId;
    private View.DesignComponent.TextField txtMaKM;
    private View.DesignComponent.TextField txtMoTa;
    private View.DesignComponent.TextField txtNgayBD;
    private View.DesignComponent.TextField txtNgayKT;
    private View.DesignComponent.TextField txtTenKM;
    // End of variables declaration//GEN-END:variables
}
