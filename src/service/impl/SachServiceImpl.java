/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.List;
import model.Sach;
import repository.SachRepositoty;
import repository.impl.SachRepositoryImpl;
import service.SachService;

/**
 *
 * @author ppolo
 */
public class SachServiceImpl implements SachService {

    private final SachRepositoty _sachRepo;

    public SachServiceImpl() {
        _sachRepo = new SachRepositoryImpl();
    }

    @Override
    public List<Sach> getList(int position, int pageSize) {
        return _sachRepo.getList(position, pageSize);
    }

    @Override
    public boolean insertSach(Sach sach) {
        return _sachRepo.insertSach(sach);
    }

    @Override
    public boolean updateSach(Sach sach) {
        return _sachRepo.updateSach(sach);
    }

}
