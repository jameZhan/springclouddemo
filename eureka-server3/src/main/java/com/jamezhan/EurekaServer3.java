package com.jamezhan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zzy
 * @version 1.0
 * @date 2019/6/10  14:36
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer3 {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaServer3.class).run(args);
    }
}
