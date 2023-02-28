package com.controller;

import com.model.Bill;
import com.service.bill.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping
public class BillController {
    @Autowired
    BillService billService;
    @GetMapping
    public List<Bill> showAllBill(){
        return billService.findAll();
    }
    @PostMapping
    public void createBill(@RequestBody Bill bill){
        billService.create(bill);
    }

    @GetMapping("/{id}")
    public Bill showEdit(@PathVariable int id){
       return billService.findById(id);
    }
    @PutMapping("/{id}")
    public void edit(@RequestBody Bill bill){
        billService.create(bill);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        billService.delete(id);
    }
}
