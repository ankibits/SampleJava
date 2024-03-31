package com.example.minor1.controllers;

import com.example.minor1.dtos.InitiateTransactionRequest;
import com.example.minor1.services.TransactionService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @PostMapping("/transaction")
    public String initiateTxn(@RequestBody @Valid InitiateTransactionRequest transactionRequest) throws Exception {

        // student id :
        // book id
        // admin id
        // txn type

        return transactionService.initiateTxn(transactionRequest);
    }
}
