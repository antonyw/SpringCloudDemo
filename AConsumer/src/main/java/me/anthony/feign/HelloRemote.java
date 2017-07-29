package me.anthony.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Anthony on 2017/7/29.
 */
@FeignClient(name = "provider-a")
public interface HelloRemote {

    @RequestMapping("/hello")
    String hello(@RequestParam(name = "text") String text);

}
