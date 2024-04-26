package com.mellsvs.accountservice.api;

import com.mellsvs.accountservice.entity.Account;
import com.mellsvs.accountservice.services.AccountService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
@RestController
@RequestMapping("account")
public class AccountApi {

    //thats best practice.Recommended dont use autowired
    private final AccountService accountService;

    public AccountApi(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("{id}")
    public ResponseEntity <Account> get(@PathVariable String id){
        return ResponseEntity.ok(accountService.get(id));
    }
    @PostMapping
    public ResponseEntity <Account> save(@RequestBody Account account){
        return  ResponseEntity.ok(accountService.save(account));
    }
    @PutMapping
    public ResponseEntity <Account> update(Account account){
        return  ResponseEntity.ok(accountService.update(account));
    }
    @DeleteMapping
    public void delete(String id){
        accountService.delete(id);
    }


}
