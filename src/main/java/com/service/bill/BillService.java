package com.service.bill;

import com.model.Bill;
import com.repository.IBillRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService implements IBillIplm{
    @Autowired
    IBillRepo iBillRepo;

    @Override
    public List<Bill> findAll() {
        return (List<Bill>) iBillRepo.findAll();
    }

    @Override
    public void create(Bill bill) {
iBillRepo.save(bill);

    }

    @Override
    public void delete(int id) {
iBillRepo.delete(id);
    }

    @Override
    public Bill findById(int id) {
        return (Bill) iBillRepo.findById(id).get();
    }
}
