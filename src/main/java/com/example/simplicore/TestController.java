package com.example.simplicore;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestController {

    @GetMapping(value = "/")
    public String welcome() {
        return "Hi welcome back";
    }

    @GetMapping(value = "/pipeline")
    public String pipeline() {
        return "ci cd pipeline is working";
    }

    @GetMapping(value = "/pipeline/v2")
    public String pipelineV2() {
        return "ci cd pipelineV2 is working";
    }


}
