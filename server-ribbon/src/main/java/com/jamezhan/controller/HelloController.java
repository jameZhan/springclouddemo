package com.jamezhan.controller;

import com.jamezhan.server.IHelloServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zzy
 * @version 1.0
 * @date 2019/6/10  15:39
 * @Description:
 */
@RestController
public class HelloController {

    @Autowired
    private IHelloServer helloServer;

    @RequestMapping("/sayHello")
    public String sayHello(String name){
        return helloServer.sayHello(name);
    }
}
