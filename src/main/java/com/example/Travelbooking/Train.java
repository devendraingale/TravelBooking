package com.example.Travelbooking;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Train {
    @GetMapping("/mytrain")
    public String getData() {
        return "Please book you Train a ticket";
    }
}
