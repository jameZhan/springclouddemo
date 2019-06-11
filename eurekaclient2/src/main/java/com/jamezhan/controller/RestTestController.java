package com.jamezhan.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zzy
 * @version 1.0
 * @date 2019/6/10  15:31
 * @Description:
 */
@RestController
public class RestTestController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hi")
    public String getHome(String name){
        return "hi " + name + " ,i am from port:" + port;
    }
}
