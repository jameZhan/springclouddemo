package com.jamezhan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author zzy
 * @version 1.0
 * @date 2019/6/10  14:55
 * @Description:
 */
@SpringBootApplication
public class EurekaClient3 {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaClient3.class).run(args);
    }
}
