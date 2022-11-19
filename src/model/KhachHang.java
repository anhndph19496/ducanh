/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author ppolo
 */
@Entity
@Table(name = "KhachHang")
public class KhachHang implements Serializable {

    @Id
    @Column(name = "Id")
    @GeneratedValue(generator = "generator")
    private String id;

    @Column(name = "Ma")
    private String ma;

    @Column(name = "Ten")
    private String ten;

    @Column(name = "TenDem")
    private String tenDem;

    @Column(name = "GioiTinh")
    private String gioiTinh;

    @Column(name = "ngaySinh")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date ngaySinh;

    @Column(name = "SDT")
    private String sdt;

    @Column(name = "DiemTichLuy")
    private int diemTichLuy;

    @Column(name = "DiaChi")
    private String diaChi;

    @OneToMany(mappedBy = "khachHang", targetEntity = HoaDon.class)
    private List<HoaDon> lstHoaDon;

    public KhachHang() {
    }

    public KhachHang(String id, String ma, String ten, String tenDem, String gioiTinh, Date ngaySinh, String sdt, int diemTichLuy, String diaChi) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.tenDem = tenDem;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.sdt = sdt;
        this.diemTichLuy = diemTichLuy;
        this.diaChi = diaChi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTenDem() {
        return tenDem;
    }

    public void setTenDem(String tenDem) {
        this.tenDem = tenDem;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getDiemTichLuy() {
        return diemTichLuy;
    }

    public void setDiemTichLuy(int diemTichLuy) {
        this.diemTichLuy = diemTichLuy;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public List<HoaDon> getLstHoaDon() {
        return lstHoaDon;
    }

    public void setLstHoaDon(List<HoaDon> lstHoaDon) {
        this.lstHoaDon = lstHoaDon;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "id=" + id + ", ma=" + ma + ", ten=" + ten + ", tenDem=" + tenDem + ", gioiTinh=" + gioiTinh + ", ngaySinh=" + ngaySinh + ", sdt=" + sdt + ", diemTichLuy=" + diemTichLuy + ", diaChi=" + diaChi + '}';
    }

}
