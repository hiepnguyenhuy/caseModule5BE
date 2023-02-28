package com.service.account;

import com.model.Account;
import com.repository.IAccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService implements IAccountIplm {
    @Autowired
    IAccountRepo iAccountRepo;

    @Override
    public List<Account> findAll() {
        return (List<Account>) iAccountRepo.findAll();
    }

    @Override
    public void create(Account account) {
        iAccountRepo.save(account);
    }

    @Override
    public void delete(int id) {
        iAccountRepo.deleteById(id);
    }

    @Override
    public Account findById(int id) {
        return (Account) iAccountRepo.findById(id).get();
    }
}
