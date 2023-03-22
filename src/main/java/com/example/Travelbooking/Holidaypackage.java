package com.example.Travelbooking;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Holidaypackage {
    @GetMapping("/Holidaypackage")
    public String getData() {
        return "Please book you a  a Holidaypackage";
    }
}