package com.jamezhan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author zzy
 * @version 1.0
 * @date 2019/6/11  14:56
 * @Description:
 */
@SpringBootApplication
@EnableZuulProxy
public class ServerZuul {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ServerZuul.class).run(args);
    }
}
