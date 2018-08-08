package com.alan.developer.testsleuth.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.SpanName;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/web")
public class ApplicationRest {

    private static Logger log = LoggerFactory.getLogger(ApplicationRest.class);

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/home")
    public String home(){
        log.info("handling home");
        testSpan();
        return "Hello world";
    }

    @SpanName("dummy")
    void testSpan() {
        log.info("Dummy");
    }

    @RequestMapping("/external")
    public String remoteTest() {
        log.info("external");
        return "Ejecución con éxito";
    }
}
