package com.example.fitz.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AffiliateController {

    @GetMapping("/affiliate")
    public String getBill(@RequestParam(value = "bill", defaultValue = "0") String bill) {
        double amount = Double.parseDouble(bill);
        Affiliate affiliate = new Affiliate();
        return String.valueOf(affiliate.getNetPayableAmount(amount));
	}
    
}
