package com.LOAN.M_PESA.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mpesa")
public class MpesaController {

    @PostMapping("/disburse")
    public ResponseEntity<String> disburseLoan() {
        return ResponseEntity.ok("loan has been disbursed successfully");
    }
}

