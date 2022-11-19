/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import java.util.List;
import model.KhuyenMai;
import service.IKhuyenMaiServicer;
import repository.IKhuyenMaiRepository;
import repository.impl.KhuyenMaiRepository;

/**
 *
 * @author adm
 */
public class KhuyenMaiServicer implements IKhuyenMaiServicer {

    private final IKhuyenMaiRepository repository = new KhuyenMaiRepository();
    private List<KhuyenMai> listKhuyenMai;

   
    @Override
    public List<KhuyenMai> selectAll() {
        listKhuyenMai = new ArrayList<>();
        var ems = repository.selectAll();
        for (KhuyenMai em : ems) {
            listKhuyenMai.add(new KhuyenMai(em.getId().toString(), em.getMa(), em.getTen(), em.getChietKhau(), em.getNgayBatDau(), em.getNgayKetThuc(), em.getTrangThai(), em.getMoTa()));
        }
        return listKhuyenMai;
    }

    @Override
    public String insert(KhuyenMai km) {
        boolean insertSuccess = repository.insert(km);
        return insertSuccess ? "Thêm thành công" : "Thêm thất bại";
    }

    @Override
    public String update(KhuyenMai km) {
        boolean insertSuccess = repository.update(km);
        return insertSuccess ? "Update thành công" : "Update thất bại";
    }

}
