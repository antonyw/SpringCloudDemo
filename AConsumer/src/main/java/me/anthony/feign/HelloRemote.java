package me.anthony.feign;

import me.anthony.hystrix.HelloRemoteHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Anthony on 2017/7/29.
 */
@FeignClient(name = "provider-a", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    @RequestMapping("/hello")
    String hello(@RequestParam(name = "text", defaultValue = "") String text);

}
