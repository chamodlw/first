package com.first.first;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/hiii") // Mapping this method to the "/first" URL
    public String first() {
        return "Chamod failed!";
    }
}
