package com.yhx.helloword.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 严海鑫
 * @date 2020-07-02-下午 16:54
 */
@Controller
public class HelloController {
    @Value("${server.port}")
    Integer port;
    @ResponseBody
    @RequestMapping("/hello")
    public  String hello(){
        return "严海鑫port"+port;

    }
}
