package com.jamezhan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author zzy
 * @version 1.0
 * @date 2019/6/10  14:15
 * @Description:
 */
@SpringBootApplication
public class EurekaClient1 {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaClient1.class).run(args);
    }
}
