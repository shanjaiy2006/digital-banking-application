package com.banking.digital_banking;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    private final BankAccountService service;

    public HealthController(BankAccountService service) {
        this.service = service;
    }

    @GetMapping("/api/health")
    public String checkHealth() {
        return service.getBankMessage();
    }
}