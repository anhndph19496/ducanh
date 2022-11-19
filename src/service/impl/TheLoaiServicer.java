/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import java.util.List;

import model.TheLoai;
import service.ITheLoaiServicer;
import repository.ITheLoaiRepository;
import repository.impl.TheLoaiRepository;

/**
 *
 * @author adm
 */
public class TheLoaiServicer implements ITheLoaiServicer {
    
    private final ITheLoaiRepository repository = new TheLoaiRepository();
    private List<TheLoai> listKhuyenMai;
    
    @Override
    public String insert(TheLoai tl) {
        boolean insertSuccess = repository.insert(tl);
        return insertSuccess ? "Thêm thành công" : "Thêm thất bại";
    }
    
    @Override
    public String update(TheLoai tl) {
        boolean insertSuccess = repository.update(tl);
        return insertSuccess ? "Update thành công" : "Update thất bại";
    }
    
    @Override
    public List<TheLoai> selectAll() {
        listKhuyenMai = new ArrayList<>();
        var ems = repository.selectAll();
        for (TheLoai em : ems) {
            listKhuyenMai.add(new TheLoai(em.getId().toString(), em.getMa(), em.getTen(), em.getMoTa()));
        }
        return listKhuyenMai;
    }
    
}
