package com.jamezhan.fegin;

import com.jamezhan.hystrix.SayHelloFeignHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zzy
 * @version 1.0
 * @date 2019/6/10  16:54
 * @Description:  负载均衡服务并提供断路器，使用feign的时候，断路器是默认不开启的，需要在配置文件中显示开启
 */
@FeignClient(value = "service-hi1",fallback = SayHelloFeignHystrix.class)
public interface IHelloFeign {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromFeign(@RequestParam(value = "name")String name);
}
