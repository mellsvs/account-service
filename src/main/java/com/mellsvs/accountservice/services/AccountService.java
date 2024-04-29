package com.mellsvs.accountservice.services;

import com.mellsvs.accountservice.entity.Account;
import com.mellsvs.accountservice.repositories.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
@RequiredArgsConstructor
public class AccountService {
    @Autowired
    private final AccountRepository accountRepository;
    public Account get(String id){
     return accountRepository.findById(id).orElseThrow(()-> new IllegalArgumentException());
    }
    public  Account save(Account account){
        return accountRepository.save(account);
    }
    public  Account update(String id,Account account){
        Assert.isNull(id,"id cannot be null");
        return accountRepository.save(account);
    }
    public void delete(String id){

    }

}
