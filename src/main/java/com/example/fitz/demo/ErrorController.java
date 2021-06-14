package com.example.fitz.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController {
    @GetMapping("/error")
    public String getError() {
        return("error. please use localhost:8080/user?bill=100 where user is affiliate,customer or employee and 100 is the bill amount");
	}
    
}
