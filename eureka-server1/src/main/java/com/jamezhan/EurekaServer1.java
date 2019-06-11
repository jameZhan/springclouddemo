package com.jamezhan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zzy
 * @version 1.0
 * @date 2019/6/10  11:04
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer1 {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaServer1.class).run(args);
    }
}
