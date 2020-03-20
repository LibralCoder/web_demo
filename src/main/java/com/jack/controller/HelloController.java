package com.jack.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chaiguanguan
 * @className HelloController
 * @description
 * @date 2020/2/25 14:14
 **/
@RestController
public class HelloController {
    @RequestMapping("/say.do")
    public Apple say() throws InterruptedException {
        Apple apple  = Apple.builder().color("红色").size(2).band("红富士").build();
        Thread.sleep(5000);
        return apple;
    }
}
