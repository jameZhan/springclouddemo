package com.jamezhan.hystrix;

import com.jamezhan.fegin.IHelloFeign;
import org.springframework.stereotype.Component;

/**
 * @author zzy
 * @version 1.0
 * @date 2019/6/10  17:45
 * @Description:
 */
@Component
public class SayHelloFeignHystrix implements IHelloFeign {

    @Override
    public String sayHiFromFeign(String name) {
        return "系统繁忙,请稍后再试!";
    }
}
