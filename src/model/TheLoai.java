/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author ppolo
 */
@Entity
@Table(name = "TheLoai")
public class TheLoai implements Serializable {

    @Id
    @Column(name = "Id")
    @GeneratedValue(generator = "generator")
    private String id;

    @Column(name = "Ma")
    private String ma;

    @Column(name = "Ten")
    private String ten;

    @Column(name = "MoTa")
    private String moTa;

    @OneToMany(mappedBy = "theLoai", targetEntity = TheLoaiChiTiet.class)
    private List<TheLoaiChiTiet> lstTheLoaiChiTiet;

    public TheLoai() {
    }

    public TheLoai(String id, String ma, String ten, String moTa) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.moTa = moTa;
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

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public List<TheLoaiChiTiet> getLstTheLoaiChiTiet() {
        return lstTheLoaiChiTiet;
    }

    public void setLstTheLoaiChiTiet(List<TheLoaiChiTiet> lstTheLoaiChiTiet) {
        this.lstTheLoaiChiTiet = lstTheLoaiChiTiet;
    }

    @Override
    public String toString() {
        return "TheLoai{" + "id=" + id + ", ma=" + ma + ", ten=" + ten + ", moTa=" + moTa + '}';
    }

    public Object[] toDaTaRow() {
        return new Object[]{id, ma, ten, moTa};
    }

    public TheLoai(String ma, String ten, String moTa) {
        this.ma = ma;
        this.ten = ten;
        this.moTa = moTa;
    }

}
