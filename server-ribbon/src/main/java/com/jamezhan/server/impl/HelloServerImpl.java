package com.jamezhan.server.impl;

import com.jamezhan.server.IHelloServer;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author zzy
 * @version 1.0
 * @date 2019/6/10  15:36
 * @Description:
 */
@Service
public class HelloServerImpl implements IHelloServer {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    @Override
    public String sayHello(String name) {
        return restTemplate.getForObject("http://SERVICE-HI1/hi?name="+name,String.class);
    }

    public String hiError(String name) {
        return "系统繁忙,请稍后再试!";
    }
}
