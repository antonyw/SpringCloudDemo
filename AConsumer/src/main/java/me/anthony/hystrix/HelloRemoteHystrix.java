package me.anthony.hystrix;

import me.anthony.feign.HelloRemote;
import org.springframework.stereotype.Component;

/**
 * Created by Anthony on 2017/7/30.
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {

    @Override
    public String hello(String text) {
        return "Hystrix is running";
    }
}
