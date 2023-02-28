package com.controller;

import com.model.Account;
import com.service.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/accounts")
public class AccountController {
    @Autowired
    AccountService accountService;

    @GetMapping
    public List<Account> showAllAccount() {
        return accountService.findAll();
    }

    @PostMapping
    public void createAccount(@RequestBody Account account) {
        accountService.create(account);
    }

    @GetMapping("/{id}")
    public Account showEdit(@PathVariable int id) {
        return accountService.findById(id);
    }

    @PutMapping("/{id}")
    public void edit(@RequestBody Account account) {
        accountService.create(account);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        accountService.delete(id);
    }
}
