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
import service.ITheLoaiServicer;
import service.impl.TheLoaiServicer;
import model.TheLoai;

/**
 *
 * @author quanc
 */
public class TheLoai_Form extends javax.swing.JPanel {

    private final int RecordOneTable = 11;
    private int indexSelected = 1;
    private int indexRow = 1;
    private int pageCurrently = 1;
    private int countJbtn = 0;
    private ITheLoaiServicer loaiServicer;
//    private List<SachFake> listS = new ArrayList<>();
    private List<Button> listBtn = new ArrayList<>();

    public TheLoai_Form() {
        initComponents();
        loaiServicer = new TheLoaiServicer();
        String columns[] = {"Id", "Ma", "Ten", "Mô Tả"};
        Object rows[][] = {};
        this.tbTheLoai.setModel(new DefaultTableModel(rows, columns));
        tbTheLoai.setDefaultEditor(Object.class, null);
        tbTheLoai.setBackground(Color.WHITE);
        this.tbTheLoai.setRowHeight(50);
        this.tbTheLoai.setBackground(Color.white);
//        ImageIcon imageIcon = new ImageIcon(new ImageIcon("image/tacgia.jpg").getImage().getScaledInstance(174, 230, Image.SCALE_DEFAULT));
//        initTableData();
        loadTable();
//        showTarget(1);

    }

    private void loadTable() {
        DefaultTableModel dtm = (DefaultTableModel) tbTheLoai.getModel();
        dtm.setRowCount(0);
        for (TheLoai loai : loaiServicer.selectAll()) {
            dtm.addRow(loai.toDaTaRow());

        }
    }

    private void fillTable(int row) {
        TheLoai loai = loaiServicer.selectAll().get(row);
        txtId.setText(loai.getId());
        txtMa.setText(loai.getMa());
        txtTen.setText(loai.getTen());
        txtMoTa.setText(loai.getMoTa());

    }

//     public void initTableData() {
    //        // Nơi đổ dữ liệu vào table
    //        // Ví dụ về đối tượng SachFake khi add Row ( sẽ tùy vào đối tượng để sửa các trường
    //        //new ModelTest(new ImageIcon("image/bookmark_30px.png"), "Bora", "Male", "C#", 300).toRowTable()
    //        //new Object[]{new ModelProfile(icon, name), Ma, soLuong, df.format(giaBan), barCode, moTa}
    //        ImageIcon imageIcon = new ImageIcon(new ImageIcon("image/dacnhantam.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
    ////        this.table1.addRow(new SachFake("SKL1", imageIcon, "Sách 1", 100, 30000, "01293123", "Mới vl").toRowTable());
    //        
    //
    //        for (int i = 0; i <= 160; i++) {
    //            listS.add(new SachFake("SKL1", imageIcon, "Sách " + i, 100, 30000, "01293123", "Mới vl"));
    //        }
    //         for (SachFake sach : listS) {
    //             tbTheLoai.addRow(sach.toRowTable());
    //         }
    ////        if (listS.size() / RecordOneTable != 0) {
    ////            countJbtn = listS.size() / RecordOneTable;
    ////            countJbtn += 1;
    ////        };
    ////        System.out.println(countJbtn);
    ////        for (int i = 0; i < countJbtn; i++) {
    ////            Button btn = new Button();
    ////            listBtn.add(btn);
    ////            btn.setText("" + (i + 1));
    ////            btn.setSize(30, 30);
    ////            btn.addActionListener(new ActionListener() {
    ////                @Override
    ////                public void actionPerformed(ActionEvent e) {
    ////                    showTarget(Integer.parseInt(btn.getText()));
    ////                    setColorButtonSelected(Integer.parseInt(btn.getText()) - 1);
    ////
    ////                }
    ////            });
    ////
    //////              JButton btn = new JButton("Hehe");
    ////            pagePanel.add(btn);
    ////        }
    //
    //    }
//    public void showTarget(int index) {
//        DefaultTableModel model = new DefaultTableModel();
//        model = (DefaultTableModel) this.tbTheLoai.getModel();
//        model.setRowCount(0);
//        int coutRecord = 0;
//        int sizeIndex = RecordOneTable * index;
//        int indexStart = sizeIndex - RecordOneTable;
//        try {
//            for (int i = indexStart; i < sizeIndex; i++) {
//                this.tbTheLoai.addRow(listS.get(i).toRowTable());
//            }
//        } catch (Exception e) {
//
//        }
//
//    }
    public void setColorButtonSelected(int index) {
        for (Button btn : listBtn) {
            btn.setBackground(Color.WHITE);
            btn.setForeground(Color.BLACK);
        }
        listBtn.get(index).setBackground(new Color(31, 31, 111));
        listBtn.get(index).setForeground(Color.WHITE);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbTheLoai = new View.DesignComponent.Table();
        btnInBaoCao = new View.ButtonDesign.Button();
        btnInBaoCao2 = new View.ButtonDesign.Button();
        combobox1 = new View.DesignComponent.Combobox();
        jPanelBourder1 = new View.DesignComponent.JPanelBourder();
        jLabel1 = new javax.swing.JLabel();
        textField1 = new View.DesignComponent.TextField();
        pagePanel = new javax.swing.JPanel();
        txtId = new View.DesignComponent.TextField();
        txtMa = new View.DesignComponent.TextField();
        txtMoTa = new View.DesignComponent.TextField();
        txtTen = new View.DesignComponent.TextField();
        btnInBaoCao1 = new View.ButtonDesign.Button();
        btnThem = new View.ButtonDesign.Button();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(452, 395));

        tbTheLoai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbTheLoai.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        tbTheLoai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTheLoaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbTheLoai);

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

        txtMa.setText("None");
        txtMa.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtMa.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtMa.setLabelText("Mã Thể Loại");
        txtMa.setLineColor(new java.awt.Color(31, 31, 111));

        txtMoTa.setText("None");
        txtMoTa.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtMoTa.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtMoTa.setLabelText("Mô Tả");
        txtMoTa.setLineColor(new java.awt.Color(31, 31, 111));

        txtTen.setText("None");
        txtTen.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTen.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtTen.setLabelText("Tên Thể Loại");
        txtTen.setLineColor(new java.awt.Color(31, 31, 111));

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

        btnThem.setBackground(new java.awt.Color(31, 31, 111));
        btnThem.setBorder(javax.swing.BorderFactory.createEmptyBorder(-3, 1, 1, 1));
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setText("Thêm");
        btnThem.setFocusable(false);
        btnThem.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 27)); // NOI18N
        jLabel2.setText("Quản Lý Thể Loại");

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
                                .addGap(452, 452, 452)
                                .addComponent(combobox1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnInBaoCao1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnInBaoCao2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnInBaoCao, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(51, 51, 51)
                                    .addComponent(txtMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(51, 51, 51)
                                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(300, 300, 300))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(137, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInBaoCao1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInBaoCao2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInBaoCao, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanelBourder1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                        .addComponent(combobox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed

    }//GEN-LAST:event_txtIdActionPerformed

    private void btnInBaoCao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInBaoCao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInBaoCao1ActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        TheLoai loai = getDaTa();
        if (loai == null) {
            return;
        } else {
            loaiServicer.insert(loai);
            loadTable();

    }//GEN-LAST:event_btnThemActionPerformed
    }
    private void tbTheLoaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTheLoaiMouseClicked
        // TODO add your handling code here:
        int row = tbTheLoai.getSelectedRow();
        fillTable(row);
    }//GEN-LAST:event_tbTheLoaiMouseClicked

    private TheLoai getDaTa() {
        String ma = txtMa.getText().trim();
        String ten = txtTen.getText().trim();
        String moTa = txtMoTa.getText().trim();
        TheLoai loai = new TheLoai(ma, ten, moTa);
        return loai;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private View.ButtonDesign.Button btnInBaoCao;
    private View.ButtonDesign.Button btnInBaoCao1;
    private View.ButtonDesign.Button btnInBaoCao2;
    private View.ButtonDesign.Button btnThem;
    private View.DesignComponent.Combobox combobox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private View.DesignComponent.JPanelBourder jPanelBourder1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pagePanel;
    private View.DesignComponent.Table tbTheLoai;
    private View.DesignComponent.TextField textField1;
    private View.DesignComponent.TextField txtId;
    private View.DesignComponent.TextField txtMa;
    private View.DesignComponent.TextField txtMoTa;
    private View.DesignComponent.TextField txtTen;
    // End of variables declaration//GEN-END:variables
}
