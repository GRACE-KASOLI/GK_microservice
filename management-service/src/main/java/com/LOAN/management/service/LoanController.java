package com.LOAN.management.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/loans") // ✅ This must match exactly!
public class LoanController {

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/disburse/{loanId}") // ✅ Ensure this matches the request URL
    public ResponseEntity<String> disburseLoan(@PathVariable Long loanId) {
        String mpesaUrl = "http://localhost:9095/mpesa/disburse";

        ResponseEntity<String> response = restTemplate.postForEntity(mpesaUrl, null, String.class);

        return ResponseEntity.ok("Loan ID " + loanId + " - " + response.getBody());
    }
}
