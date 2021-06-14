package com.example.fitz.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/employee")
    public String getBill(@RequestParam(value = "bill", defaultValue = "0") String bill) {
        double amount = Double.parseDouble(bill);
        Employee employee = new Employee();
        return String.valueOf(employee.getNetPayableAmount(amount));
	}
    
}
