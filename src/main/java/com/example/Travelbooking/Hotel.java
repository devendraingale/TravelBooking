package com.example.Travelbooking;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Hotel {
    @GetMapping("/myhotel")
    public String getData() {
        return "Please book you  a Hotel ticket";
    }
}
