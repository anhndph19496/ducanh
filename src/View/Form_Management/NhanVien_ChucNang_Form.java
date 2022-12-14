/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.Form_Management;

import View.ScrollBarCustom;
import java.awt.Image;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author quanc
 */
public class NhanVien_ChucNang_Form extends javax.swing.JPanel {

    /**
     * Creates new form NhanVien_ChucNang_Form
     */
    public NhanVien_ChucNang_Form() {
        initComponents();
        this.Form_Chon.show(false);
        this.background.show(false);
//            this.jScrollPane1.show(false);
        ScrollBarCustom scr = new ScrollBarCustom();
        this.scroll.setVerticalScrollBar(scr);
        this.cbSelect.removeAllItems();

        String tacgia[] = {"Quân Minh",
            "Thế Phương",
            "Đức Anh",
            "Linh",
            "Hương",
            "Nam"};
        DefaultComboBoxModel model = new DefaultComboBoxModel(tacgia);
        this.cbSelect.setModel(model);
        Icon icon = new ImageIcon(new ImageIcon("image/nhanvien.jpg").getImage().getScaledInstance(260, 320, Image.SCALE_DEFAULT));
        this.lbAvatar.setIcon(icon);

        Icon iconbgr = new ImageIcon("image/background_btn.png");
        this.background.setIcon(iconbgr);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Form_Chon = new javax.swing.JPanel();
        cbSelect = new View.ComboBoxDesign.ComboBoxSuggestion();
        jPanel3 = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        lbTen = new javax.swing.JLabel();
        TruongThongTin = new javax.swing.JPanel();
        txtTen = new View.DesignComponent.TextField();
        txtTen1 = new View.DesignComponent.TextField();
        txtTen4 = new View.DesignComponent.TextField();
        txtTen5 = new View.DesignComponent.TextField();
        txtTen6 = new View.DesignComponent.TextField();
        barcode = new View.DesignComponent.TextField();
        txtTen8 = new View.DesignComponent.TextField();
        txtTen9 = new View.DesignComponent.TextField();
        soLuong = new View.DesignComponent.TextField();
        txtReset = new javax.swing.JTextField();
        combobox1 = new View.DesignComponent.Combobox();
        btnInBaoCao = new View.ButtonDesign.Button();
        btnInBaoCao1 = new View.ButtonDesign.Button();
        lbAvatar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        combobox2 = new View.DesignComponent.Combobox();
        combobox3 = new View.DesignComponent.Combobox();
        barcode1 = new View.DesignComponent.TextField();
        combobox4 = new View.DesignComponent.Combobox();
        background = new View.ButtonDesign.Background();

        setLayout(null);

        Form_Chon.setBackground(new java.awt.Color(255, 255, 255));

        cbSelect.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        cbSelect.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbSelectItemStateChanged(evt);
            }
        });
        cbSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSelectActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridLayout());

        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.Y_AXIS));
        scroll.setViewportView(jPanel4);

        jPanel3.add(scroll);

        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 1));

        lbTen.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lbTen.setForeground(new java.awt.Color(31, 31, 111));
        lbTen.setText("Chon");

        javax.swing.GroupLayout Form_ChonLayout = new javax.swing.GroupLayout(Form_Chon);
        Form_Chon.setLayout(Form_ChonLayout);
        Form_ChonLayout.setHorizontalGroup(
            Form_ChonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Form_ChonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Form_ChonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Form_ChonLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(lbTen)
                        .addContainerGap(256, Short.MAX_VALUE))
                    .addGroup(Form_ChonLayout.createSequentialGroup()
                        .addGroup(Form_ChonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Form_ChonLayout.createSequentialGroup()
                                .addComponent(cbSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        Form_ChonLayout.setVerticalGroup(
            Form_ChonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Form_ChonLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lbTen, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(Form_Chon);
        Form_Chon.setBounds(420, 80, 470, 420);

        TruongThongTin.setBackground(new java.awt.Color(255, 255, 255));

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
        txtTen1.setLabelText("Mã Nhân Viên");
        txtTen1.setLineColor(new java.awt.Color(31, 31, 111));

        txtTen4.setText("None");
        txtTen4.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTen4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtTen4.setLabelText("Địa Chỉ");
        txtTen4.setLineColor(new java.awt.Color(31, 31, 111));

        txtTen5.setText("None");
        txtTen5.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTen5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtTen5.setLabelText("Họ");
        txtTen5.setLineColor(new java.awt.Color(31, 31, 111));

        txtTen6.setText("None");
        txtTen6.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTen6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtTen6.setLabelText("Ngày Sinh");
        txtTen6.setLineColor(new java.awt.Color(31, 31, 111));

        barcode.setText("None");
        barcode.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        barcode.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        barcode.setLabelText("Số Điện Thoại");
        barcode.setLineColor(new java.awt.Color(31, 31, 111));

        txtTen8.setText("None");
        txtTen8.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTen8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtTen8.setLabelText("Email");
        txtTen8.setLineColor(new java.awt.Color(31, 31, 111));

        txtTen9.setText("None");
        txtTen9.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTen9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtTen9.setLabelText("Tên");
        txtTen9.setLineColor(new java.awt.Color(31, 31, 111));

        soLuong.setText("None");
        soLuong.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        soLuong.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        soLuong.setLabelText("Tên Đệm");
        soLuong.setLineColor(new java.awt.Color(31, 31, 111));

        txtReset.setText("jTextField1");

        combobox1.setMaximumRowCount(10);
        combobox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item1", "Item2", "Item3", "Item1", "Item2", "Item3", "Item1", "Item2", "Item3" }));
        combobox1.setSelectedIndex(-1);
        combobox1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        combobox1.setLabeText("Chức Vụ");
        combobox1.setLineColor(new java.awt.Color(31, 31, 111));

        btnInBaoCao.setBackground(new java.awt.Color(31, 31, 111));
        btnInBaoCao.setBorder(javax.swing.BorderFactory.createEmptyBorder(-3, 1, 1, 1));
        btnInBaoCao.setForeground(new java.awt.Color(255, 255, 255));
        btnInBaoCao.setText("Thêm");
        btnInBaoCao.setFocusable(false);
        btnInBaoCao.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnInBaoCao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInBaoCaoActionPerformed(evt);
            }
        });

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

        lbAvatar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Ảnh");

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 27)); // NOI18N
        jLabel1.setText("Quản Lý Sách / Điều Chỉnh Nhân Viên");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Thông tin cơ bản");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Nhập tên và các thông tin cơ bản của nhân viên");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(892, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        combobox2.setMaximumRowCount(10);
        combobox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item1", "Item2", "Item3", "Item1", "Item2", "Item3", "Item1", "Item2", "Item3" }));
        combobox2.setSelectedIndex(-1);
        combobox2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        combobox2.setLabeText("Trạng Thái");
        combobox2.setLineColor(new java.awt.Color(31, 31, 111));

        combobox3.setMaximumRowCount(10);
        combobox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item1", "Item2", "Item3", "Item1", "Item2", "Item3", "Item1", "Item2", "Item3" }));
        combobox3.setSelectedIndex(-1);
        combobox3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        combobox3.setLabeText("ID Gửi Báo Cáo");
        combobox3.setLineColor(new java.awt.Color(31, 31, 111));

        barcode1.setText("None");
        barcode1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        barcode1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        barcode1.setLabelText("Mật Khẩu");
        barcode1.setLineColor(new java.awt.Color(31, 31, 111));

        combobox4.setMaximumRowCount(10);
        combobox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item1", "Item2", "Item3", "Item1", "Item2", "Item3", "Item1", "Item2", "Item3" }));
        combobox4.setSelectedIndex(-1);
        combobox4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        combobox4.setLabeText("Giới Tính");
        combobox4.setLineColor(new java.awt.Color(31, 31, 111));

        javax.swing.GroupLayout TruongThongTinLayout = new javax.swing.GroupLayout(TruongThongTin);
        TruongThongTin.setLayout(TruongThongTinLayout);
        TruongThongTinLayout.setHorizontalGroup(
            TruongThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TruongThongTinLayout.createSequentialGroup()
                .addGroup(TruongThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(TruongThongTinLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(TruongThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(TruongThongTinLayout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jLabel4)))
                        .addGap(100, 100, 100)
                        .addGroup(TruongThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(TruongThongTinLayout.createSequentialGroup()
                                .addGroup(TruongThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTen9, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(soLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTen4, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTen8, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combobox2, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combobox3, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(TruongThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(TruongThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(combobox1, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                                        .addComponent(txtTen5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txtTen6, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(barcode, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(TruongThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(combobox4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(barcode1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))))
                            .addGroup(TruongThongTinLayout.createSequentialGroup()
                                .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTen1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(TruongThongTinLayout.createSequentialGroup()
                        .addGap(411, 411, 411)
                        .addComponent(btnInBaoCao1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnInBaoCao, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TruongThongTinLayout.setVerticalGroup(
            TruongThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TruongThongTinLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(TruongThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TruongThongTinLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(lbAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4))
                    .addGroup(TruongThongTinLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(TruongThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTen1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(TruongThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTen9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTen5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(TruongThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(soLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combobox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(TruongThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTen6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTen4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(TruongThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(barcode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTen8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(TruongThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combobox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(barcode1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(TruongThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combobox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combobox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TruongThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInBaoCao1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInBaoCao, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(119, 119, 119))
        );

        add(TruongThongTin);
        TruongThongTin.setBounds(0, 0, 1370, 800);

        background.setBackground(new java.awt.Color(0, 0, 0));
        background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        background.setBorderPainted(false);
        background.setFocusPainted(false);
        background.setFocusable(false);
        background.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backgroundActionPerformed(evt);
            }
        });
        add(background);
        background.setBounds(0, 0, 1370, 800);
    }// </editor-fold>//GEN-END:initComponents

    private void cbSelectItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSelectItemStateChanged

    }//GEN-LAST:event_cbSelectItemStateChanged

    private void cbSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSelectActionPerformed
//
//        String tacgia = this.cbSelect.getSelectedItem().toString();
//        Item item = new Item(tacgia);
//
//        item.addEventRemove(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                jPanel4.remove(item);
//                repaint();
//                revalidate();
//            }
//        }
//        );
//        this.jPanel4.add(item);
//        revalidate();
//        System.out.println(item.getText());
    }//GEN-LAST:event_cbSelectActionPerformed

    private void txtTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenActionPerformed

    }//GEN-LAST:event_txtTenActionPerformed

    private void btnInBaoCaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInBaoCaoActionPerformed

    }//GEN-LAST:event_btnInBaoCaoActionPerformed

    private void btnInBaoCao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInBaoCao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInBaoCao1ActionPerformed

    private void backgroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backgroundActionPerformed
        this.Form_Chon.show(false);
        this.background.show(false);
//        this.btnSelectTacGia.show(true);
        this.TruongThongTin.show(true);
        //        revalidate();
    }//GEN-LAST:event_backgroundActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Form_Chon;
    private javax.swing.JPanel TruongThongTin;
    private View.ButtonDesign.Background background;
    private View.DesignComponent.TextField barcode;
    private View.DesignComponent.TextField barcode1;
    private View.ButtonDesign.Button btnInBaoCao;
    private View.ButtonDesign.Button btnInBaoCao1;
    private View.ComboBoxDesign.ComboBoxSuggestion cbSelect;
    private View.DesignComponent.Combobox combobox1;
    private View.DesignComponent.Combobox combobox2;
    private View.DesignComponent.Combobox combobox3;
    private View.DesignComponent.Combobox combobox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbAvatar;
    private javax.swing.JLabel lbTen;
    private javax.swing.JScrollPane scroll;
    private View.DesignComponent.TextField soLuong;
    private javax.swing.JTextField txtReset;
    private View.DesignComponent.TextField txtTen;
    private View.DesignComponent.TextField txtTen1;
    private View.DesignComponent.TextField txtTen4;
    private View.DesignComponent.TextField txtTen5;
    private View.DesignComponent.TextField txtTen6;
    private View.DesignComponent.TextField txtTen8;
    private View.DesignComponent.TextField txtTen9;
    // End of variables declaration//GEN-END:variables
}
