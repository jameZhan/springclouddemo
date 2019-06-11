package com.jamezhan.controller;

import com.jamezhan.fegin.IHelloFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zzy
 * @version 1.0
 * @date 2019/6/10  17:00
 * @Description:
 */
@RestController
public class SayHelloFeignController {


    @Autowired
    private IHelloFeign helloFeign;

    @RequestMapping("/sayHelloFromFeign")
    public String sayHello(String name){
        return helloFeign.sayHiFromFeign(name);
    }

}
