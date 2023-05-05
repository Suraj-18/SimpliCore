package com.example.simplicore;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/wellcome")
public class TestController {

    @GetMapping
    public String wellcome() {
        return "Hi wellcome back";
    }
}
