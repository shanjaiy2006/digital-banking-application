package com.banking.digital_banking;

import org.springframework.stereotype.Service;

@Service
public class BankAccountService {

    public String getBankMessage() {
        return "Welcome to Digital Banking";
    }
}