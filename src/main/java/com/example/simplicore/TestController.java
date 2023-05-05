package com.example.simplicore;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping
public class TestController {

    @GetMapping(value = "/")
    public String welcome() {
        log.info("Root Api Called");
        return "Hi welcome back";
    }

    @GetMapping(value = "/pipeline")
    public String pipeline() {
        log.info("Pipeline Api Called");
        return "ci cd pipeline is working";
    }

    @GetMapping(value = "/pipeline/v2")
    public String pipelineV2() {
        log.info("Pipeline Api 2 Called");
        return "ci cd pipelineV2 is working";
    }


}
