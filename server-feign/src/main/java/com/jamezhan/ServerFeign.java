package com.jamezhan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zzy
 * @version 1.0
 * @date 2019/6/10  16:38
 * @Description:
 */
@SpringBootApplication
@EnableFeignClients
public class ServerFeign {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ServerFeign.class).run(args);
    }

}
