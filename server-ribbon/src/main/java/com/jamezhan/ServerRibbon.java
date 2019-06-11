package com.jamezhan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author zzy
 * @version 1.0
 * @date 2019/6/10  15:07
 * @Description:
 */
@SpringBootApplication
@EnableHystrix
public class ServerRibbon {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ServerRibbon.class).run(args);
    }
}
