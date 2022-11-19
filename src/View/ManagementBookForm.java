/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import View.Form_Management.BieuDo_Form;
import View.DesignComponent.Notification;
import View.Form_Management.ChucVu_Form;
import View.Form_Management.KhachHang_Form;
import View.Form_Management.KhuyenMai_Form;
import View.Form_Management.NXB_Form;
import View.Form_Management.NhanVien_ChucNang_Form;
import View.Form_Management.NhanVien_Form;
import View.Form_Management.Sach_ChucNang_Form;
import View.Form_Management.Sach_Form;
import View.Form_Management.TacGia_Form;
import View.Form_Management.TheLoai_Form;
import View.Form_Management.Vitri_Form;
import com.jhlabs.image.Gradient;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Frame;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

import javax.swing.border.LineBorder;

/**
 *
 * @author quanc
 */
public class ManagementBookForm extends javax.swing.JFrame {

    private int indexSelectedJPanel = 1;
    List<JPanel> listForm = new ArrayList<>();
    List<JButton> listBtn = new ArrayList<>();
    BieuDo_Form bieuDoForm = new BieuDo_Form();
    List<JLabel> listJLabel = new ArrayList<>();
    List<JPanel> listJPanel = new ArrayList<>();

    public ManagementBookForm() {
        initComponents();
        this.setLocationRelativeTo(null);

        // Phần Giao Diện
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 10, 10));
        ImageIcon img = new ImageIcon("image/logo_icon2.png");
        this.setIconImage(img.getImage());
        LineBorder line = new LineBorder(Color.black, 2, true);
        this.scroll.getViewport().setBackground(ColorFrame.COLOR_KEY);
        scroll.getVerticalScrollBar().setUI(new ModernScrollBarUI());
        scroll.getVerticalScrollBar().setBackground(ColorFrame.COLOR_BGR);

        Sach_Form sach = new Sach_Form();
        Sach_ChucNang_Form scn = new Sach_ChucNang_Form();
        NXB_Form nxb = new NXB_Form();
        TacGia_Form tg = new TacGia_Form();
        TheLoai_Form tl = new TheLoai_Form();
        NhanVien_Form nv = new NhanVien_Form();
        ChucVu_Form cv = new ChucVu_Form();
        NhanVien_ChucNang_Form nvcn = new NhanVien_ChucNang_Form();
        KhuyenMai_Form km = new KhuyenMai_Form();
        KhachHang_Form kh = new KhachHang_Form();
        Vitri_Form vt = new Vitri_Form();

        this.Layout_1_Card.add(bieuDoForm);// 0
        this.Layout_1_Card.add(sach);// 1
        this.Layout_1_Card.add(scn); // 2
        this.Layout_1_Card.add(nxb); // 3
        this.Layout_1_Card.add(tg); // 4
        this.Layout_1_Card.add(tl); // 5
        this.Layout_1_Card.add(nv); // 6
        this.Layout_1_Card.add(cv); // 7
        this.Layout_1_Card.add(nvcn); // 8
        this.Layout_1_Card.add(km); //9
        this.Layout_1_Card.add(kh); // 10
        this.Layout_1_Card.add(vt); // 10

        this.Layout_1_Card.revalidate();

        listForm.add(bieuDoForm);
        listForm.add(sach);
        listForm.add(scn);
        listForm.add(nxb);
        listForm.add(tg);
        listForm.add(tl);
        listForm.add(nv);
        listForm.add(cv);
        listForm.add(nvcn);
        listForm.add(km);
        listForm.add(kh);
        listForm.add(vt);

        excute();

        listBtn.add(sach.getListbtn());
        listBtn.add(nv.getListbtn());
        listBtn.get(0).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showJPanel(3);

            }
        });
        listBtn.get(1).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showJPanel(9);

            }
        });
        Icon iconStore = new ImageIcon("image/icons8_online_store_30px.png");
        lbIcon.setIcon(iconStore);
        Icon iconInves = new ImageIcon("image/icons8_investment_portfolio_30px.png");

        lbIcon1.setIcon(iconInves);
        Icon iconLogo = new ImageIcon("image/888(2).png");
        logoTeam.setIcon(iconLogo);

        listJLabel.add(banHangName);
        listJLabel.add(tongquanName);

        listJPanel.add(panelBanHang);
        listJPanel.add(panelBH);

        listJPanel.add(panelTongquan);
        listJPanel.add(panelTQ);

        setBgrJPanel();
        setJPanel(2);

    }

    private List<MenuItem> listItemCha = new ArrayList<>();

    public void runNotification() {
        Notification panelss = new Notification(this, Notification.Type.SUCCESS, "In báo cáo thành công");
        System.out.println(Notification.Location.TOP_CENTER);
        panelss.showNotification();
    }

    private void excute() {
        boolean MenuItem_ = true;
        boolean item_ = false;

        //Create sub menu
        Icon iconSach = new ImageIcon("image/icons8_bookmark_30px.png");
        Icon iconsachMini = new ImageIcon("image/bookmini.png");
        Icon iconNXB = new ImageIcon("image/nxb.png");
        Icon iconTTTG = new ImageIcon("image/tacgia.png");
        Icon iconTheLoai = new ImageIcon("image/theloai.png");

        Icon iconhoaDon = new ImageIcon("image/icons8_bill_30px.png");
        Icon iconKM = new ImageIcon("image/icons8_sale_30px.png");
        Icon iconTK = new ImageIcon("image/icons8_combo_chart_30px.png");
        Icon iconKho = new ImageIcon("image/icons8_warehouse_30px.png");
        Icon iconKH = new ImageIcon("image/icons8_customer_30px.png");
        Icon iconNV = new ImageIcon("image/icons8_user_group_30px.png");
        Icon iconLO = new ImageIcon("image/icons8_exit_sign_30px.png");
        Icon iconHDBan = new ImageIcon("image/hoadonBan.png");
        Icon iconHDTra = new ImageIcon("image/hoadonTra.png");
        Icon iconSettings = new ImageIcon("image/notification_30px.png");
        Icon iconChucvu = new ImageIcon("image/icons8_portrait_30px.png");
        Icon iconTTNV = new ImageIcon("image/icons8_video_conference_30px.png");
        Icon iconVitri = new ImageIcon("image/icons8_home_address_30px.png");

        MenuItem ItemSach = new MenuItem(iconsachMini, "                 Sách", null);
        ActionListenerJLabel(ItemSach.getIcon(), 2, ItemSach, item_);

        MenuItem ItemNXB = new MenuItem(iconNXB, "                 Nhà Xuất Bản", null);
        ActionListenerJLabel(ItemNXB.getIcon(), 4, ItemNXB, item_);

        MenuItem ItemVitri = new MenuItem(iconVitri, "                 Vị Trí", null);
        ActionListenerJLabel(ItemVitri.getIcon(), 12, ItemVitri, item_);

        MenuItem ItemTTTG = new MenuItem(iconTTTG, "                 Thông tin tác giả", null);
        ActionListenerJLabel(ItemTTTG.getIcon(), 5, ItemTTTG, item_);

        MenuItem ItemTheLoai = new MenuItem(iconTheLoai, "                 Thể Loại", null);
        ActionListenerJLabel(ItemTheLoai.getIcon(), 6, ItemTheLoai, item_);

        MenuItem ItemHoaDonBan = new MenuItem(iconHDBan, "                 Hóa Đơn Bán", null);
        ActionListenerJLabel(ItemHoaDonBan.getIcon(), 1, ItemHoaDonBan, item_);

        MenuItem ItemPhieuTra = new MenuItem(iconHDTra, "                 Hóa Đơn Trả", null);
        MenuItem ItemnhapKho = new MenuItem(null, "                 Nhập Kho", null);
        MenuItem ItemKiemKho = new MenuItem(null, "                 Kiểm Kho", null);
        MenuItem ItemDoanhThu = new MenuItem(null, "                 Thu - Chi", null);
        MenuItem ItemCuaHang = new MenuItem(null, "                 Cửa Hàng", null);
        MenuItem ItemGiaoCa = new MenuItem(null, "                 Giao Ca", null);

        MenuItem ItemChucVu = new MenuItem(iconTTNV, "                 Chức Vụ", null);
        ActionListenerJLabel(ItemChucVu.getIcon(), 8, ItemTheLoai, item_);

        MenuItem ItemTTNV = new MenuItem(iconChucvu, "                 TT Nhân Viên", null);
        ActionListenerJLabel(ItemTTNV.getIcon(), 7, ItemTheLoai, item_);

        MenuItem menuSach = new MenuItem(iconSach, "                 Quản Lý Sách", null, ItemSach, ItemNXB, ItemTTTG, ItemTheLoai, ItemVitri);
        menuSach.setBackground(ColorFrame.COLOR_KEY);
        menuSach.getNameLabel().setForeground(new Color(204, 204, 204));
        Icon down = new ImageIcon("image/icons8_expand_arrow_25px_1.png");
        menuSach.setIconUpDown(down);

        MenuItem menuHoaDon = new MenuItem(iconhoaDon, "                 Hóa Đơn", null);
        menuHoaDon.setBackground(ColorFrame.COLOR_KEY);
        menuHoaDon.getNameLabel().setForeground(new Color(204, 204, 204));

        MenuItem menuKM = new MenuItem(iconKM, "                 Khuyến Mãi", null);
        ActionListenerJLabel(menuKM.getIcon(), 10, menuKM, MenuItem_);

        menuKM.setBackground(ColorFrame.COLOR_KEY);
        menuKM.getNameLabel().setForeground(new Color(204, 204, 204));

        MenuItem menudoanhThu = new MenuItem(null, "                 Doanh Thu", null);
        menudoanhThu.setBackground(ColorFrame.COLOR_KEY);
        menudoanhThu.getNameLabel().setForeground(new Color(204, 204, 204));

        MenuItem menuthongKe = new MenuItem(iconTK, "                 Thống Kê", null, ItemDoanhThu, ItemCuaHang);
        menuthongKe.setBackground(ColorFrame.COLOR_KEY);
        menuthongKe.getNameLabel().setForeground(new Color(204, 204, 204));
        menuthongKe.setIconUpDown(down);

        MenuItem menunhapKho = new MenuItem(iconKho, "                 Quản Lý Kho", null, ItemnhapKho, ItemKiemKho);
        menunhapKho.setBackground(ColorFrame.COLOR_KEY);
        menunhapKho.getNameLabel().setForeground(new Color(204, 204, 204));
        menunhapKho.setIconUpDown(down);

        MenuItem menuKH_NCC = new MenuItem(iconKH, "                 Khách Hàng - NCC", null);
        menuKH_NCC.setBackground(ColorFrame.COLOR_KEY);
        menuKH_NCC.getNameLabel().setForeground(new Color(204, 204, 204));
        ActionListenerJLabel(menuKH_NCC.getIcon(), 11, menuKH_NCC, MenuItem_);

        MenuItem menuNhanVien = new MenuItem(iconNV, "                 Nhân Viên", null, ItemChucVu, ItemTTNV);
        menuNhanVien.setBackground(ColorFrame.COLOR_KEY);
        menuNhanVien.getNameLabel().setForeground(new Color(204, 204, 204));
        menuNhanVien.setIconUpDown(down);
//        menuNhanVien.setIconUpDown(down);

        MenuItem menuDangXuat = new MenuItem(iconLO, "                 Đăng Xuất", null);
        menuDangXuat.setBackground(ColorFrame.COLOR_KEY);
        menuDangXuat.getNameLabel().setForeground(new Color(204, 204, 204));

        addMenu(menuSach, menuHoaDon, menuNhanVien, menuthongKe, menunhapKho, menuKM, menuKH_NCC, menuDangXuat);

    } // Giao Diện

    private void addMenu(MenuItem... menu) {

        for (int i = 0; i < menu.length; i++) {
            menus.add(menu[i]);

            menu[i].setCursor(new Cursor(Cursor.HAND_CURSOR));
//            menu[i].setBackground(Color.red);
            ArrayList<MenuItem> subMenu = menu[i].getSubMenu();
            for (MenuItem menuItem : subMenu) {
                addMenu(menuItem);
            }
        }
        menus.revalidate();
    }

    public void showJPanel(int index) {
        for (JPanel j : listForm) {
            j.show(false);
        }
        listForm.get(index - 1).show(true);
    }

    private void ActionListenerJLabel(JLabel lb, int index, MenuItem item, boolean... menu) {
        lb.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showJPanel(index);

            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println(index);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (menu[0] != true) {
                    item.setBackground(new Color(29, 40, 55));
                    item.setCursor(new Cursor(Cursor.HAND_CURSOR));
                }

            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (menu[0] != true) {
                    item.setBackground(new Color(29, 32, 52));
                }
            }
        });
    } //Giao Diện

    private void setBgrJPanel() {
        for (int i = 0; i < listJPanel.size(); i += 2) {
            System.out.println(i);
            int indexJpanel = i;
            int fixFistSize = -1;
            fixFistSize = i == 0 ? 1 : i;
            listJLabel.get(fixFistSize - 1).addMouseListener(new MouseListener() {

                @Override
                public void mouseClicked(MouseEvent e) {
                    setJPanel(indexJpanel);
                }

                @Override
                public void mousePressed(MouseEvent e) {
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                }

                @Override
                public void mouseEntered(MouseEvent e) {

                }

                @Override
                public void mouseExited(MouseEvent e) {
                }
            });
        }
    }

    private void setJPanel(int index) {
        for (int i = 0; i < listJPanel.size(); i += 2) {
            listJPanel.get(i).setBackground(new Color(37, 44, 72));
            listJPanel.get(i + 1).setBackground(new Color(37, 44, 72));

        }
        indexSelectedJPanel = index;
        if (index == 2) {
            showJPanel(1);
            bieuDoForm.startTrungGian();

        }
        System.out.println("ra" + indexSelectedJPanel + " - " + index);

        listJPanel.get(indexSelectedJPanel).setBackground(new Color(36, 48, 94));
        listJPanel.get(indexSelectedJPanel + 1).setBackground(new Color(19, 29, 243));

    }

// Kết Thúc Giao Diện
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        menus = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        panelBanHang = new javax.swing.JPanel();
        panelBH = new javax.swing.JPanel();
        lbIconUpDown = new javax.swing.JLabel();
        lbIcon = new javax.swing.JLabel();
        banHangName = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        panelTongquan = new javax.swing.JPanel();
        panelTQ = new javax.swing.JPanel();
        lbIconUpDown1 = new javax.swing.JLabel();
        lbIcon1 = new javax.swing.JLabel();
        tongquanName = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        logoTeam = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        button1 = new View.ButtonDesign.Button();
        button2 = new View.ButtonDesign.Button();
        Layout_1_Card = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(37, 44, 72));

        jPanel2.setBackground(new java.awt.Color(37, 44, 72));

        scroll.setBackground(new java.awt.Color(255, 255, 255));
        scroll.setBorder(null);
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        menus.setBackground(new java.awt.Color(37, 44, 72));
        menus.setAlignmentY(0.2F);
        menus.setOpaque(false);
        menus.setLayout(new javax.swing.BoxLayout(menus, javax.swing.BoxLayout.Y_AXIS));
        scroll.setViewportView(menus);

        jPanel11.setBackground(new java.awt.Color(29, 32, 57));
        jPanel11.setPreferredSize(new java.awt.Dimension(0, 2));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("VENTURE");

        panelBanHang.setBackground(new java.awt.Color(37, 44, 72));
        panelBanHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelBanHang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBH.setBackground(new java.awt.Color(19, 29, 243));

        javax.swing.GroupLayout panelBHLayout = new javax.swing.GroupLayout(panelBH);
        panelBH.setLayout(panelBHLayout);
        panelBHLayout.setHorizontalGroup(
            panelBHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelBHLayout.setVerticalGroup(
            panelBHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 53, Short.MAX_VALUE)
        );

        panelBanHang.add(panelBH, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 53));
        panelBanHang.add(lbIconUpDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 40, 40));

        lbIcon.setBackground(new java.awt.Color(66, 66, 176));
        panelBanHang.add(lbIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 180, 50));

        banHangName.setBackground(new java.awt.Color(0, 0, 0));
        banHangName.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        banHangName.setForeground(new java.awt.Color(255, 255, 255));
        banHangName.setText("                 POS - Máy Bán Hàng");
        panelBanHang.add(banHangName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 56));

        jLabel8.setBackground(new java.awt.Color(102, 102, 102));
        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("MANAGEMENT");

        panelTongquan.setBackground(new java.awt.Color(36, 48, 94));
        panelTongquan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelTongquan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelTongquanMouseEntered(evt);
            }
        });
        panelTongquan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTQ.setBackground(new java.awt.Color(19, 29, 243));

        javax.swing.GroupLayout panelTQLayout = new javax.swing.GroupLayout(panelTQ);
        panelTQ.setLayout(panelTQLayout);
        panelTQLayout.setHorizontalGroup(
            panelTQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelTQLayout.setVerticalGroup(
            panelTQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 53, Short.MAX_VALUE)
        );

        panelTongquan.add(panelTQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 53));
        panelTongquan.add(lbIconUpDown1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 40, 40));

        lbIcon1.setBackground(new java.awt.Color(66, 66, 176));
        lbIcon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbIcon1MouseClicked(evt);
            }
        });
        panelTongquan.add(lbIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

        tongquanName.setBackground(new java.awt.Color(0, 0, 0));
        tongquanName.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        tongquanName.setForeground(new java.awt.Color(255, 255, 255));
        tongquanName.setText("                 Tổng Quan");
        panelTongquan.add(tongquanName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 56));

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 2, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("@2022 team 1 phongtt35");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTongquan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scroll)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addComponent(panelBanHang, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTongquan, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(22, 22, 22))
        );

        jLabel6.setBackground(new java.awt.Color(0, 0, 102));
        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(97, 97, 216));
        jLabel6.setText("F");

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Book");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(logoTeam)
                .addGap(2, 2, 2)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(logoTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(23, 28, 49));

        jPanel4.setBackground(new java.awt.Color(29, 32, 57));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("BupMangNon1       ");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jPanel7.setBackground(new java.awt.Color(23, 28, 49));
        jPanel7.setPreferredSize(new java.awt.Dimension(1, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(23, 28, 49));
        jPanel8.setPreferredSize(new java.awt.Dimension(1, 0));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        button1.setBackground(new java.awt.Color(29, 32, 57));
        button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image_Hub/icons8_settings_25px.png"))); // NOI18N

        button2.setBackground(new java.awt.Color(29, 32, 57));
        button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image_Hub/icons8_doorbell_25px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(1071, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))))
        );

        Layout_1_Card.setBackground(new java.awt.Color(255, 255, 255));
        Layout_1_Card.setLayout(new java.awt.CardLayout());

        jPanel9.setBackground(new java.awt.Color(29, 32, 57));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image_Hub/icons8_multiply_38px_1.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image_Hub/icons8_horizontal_line_38px.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(16, 16, 16))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Layout_1_Card, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Layout_1_Card, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(29, 32, 57));
        jPanel5.setPreferredSize(new java.awt.Dimension(6, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 966, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        bieuDoForm.startTrungGian();
    }//GEN-LAST:event_formWindowOpened

    private void btnSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSettingActionPerformed

    private void btnSetting1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetting1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSetting1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void panelTongquanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTongquanMouseEntered

    }//GEN-LAST:event_panelTongquanMouseEntered

    private void lbIcon1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbIcon1MouseClicked

    }//GEN-LAST:event_lbIcon1MouseClicked

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
            java.util.logging.Logger.getLogger(ManagementBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagementBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagementBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagementBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagementBookForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Layout_1_Card;
    private javax.swing.JLabel banHangName;
    private View.ButtonDesign.Button button1;
    private View.ButtonDesign.Button button2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbIcon1;
    private javax.swing.JLabel lbIconUpDown;
    private javax.swing.JLabel lbIconUpDown1;
    private javax.swing.JLabel logoTeam;
    private javax.swing.JPanel menus;
    private javax.swing.JPanel panelBH;
    private javax.swing.JPanel panelBanHang;
    private javax.swing.JPanel panelTQ;
    private javax.swing.JPanel panelTongquan;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JLabel tongquanName;
    // End of variables declaration//GEN-END:variables
}
