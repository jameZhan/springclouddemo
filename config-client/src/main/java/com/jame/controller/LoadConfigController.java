package com.jame.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zzy
 * @version 1.0
 * @date 2019/6/12  14:30
 * @Description:
 */
@RestController
public class LoadConfigController {

    @Value("${foo}")
    private String message;

    @RequestMapping("/getMessage")
    public String getMessage(){
        return message;
    }
}
