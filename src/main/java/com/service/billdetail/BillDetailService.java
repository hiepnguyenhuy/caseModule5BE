package com.service.billdetail;

import com.model.BillDetail;
import com.repository.IBillDetailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BillDetailService implements IBillDetailIplm{
    @Autowired
    IBillDetailRepo iBillDetailRepo;
    @Override
    public List<BillDetail> findAll() {
        return (List<BillDetail>) iBillDetailRepo.findAll();
    }

    @Override
    public void create(BillDetail billDetail) {
iBillDetailRepo.save(iBillDetailRepo);
    }

    @Override
    public void delete(int id) {
iBillDetailRepo.delete(id);
    }

    @Override
    public BillDetail findById(int id) {
        return null;
    }
}
