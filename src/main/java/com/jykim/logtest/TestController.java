package com.jykim.logtest;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public void test() {
        MDC.put("test", "메롱");
        System.out.println(Thread.currentThread().getName());
        log.info("asdfasdf");
    }
}
