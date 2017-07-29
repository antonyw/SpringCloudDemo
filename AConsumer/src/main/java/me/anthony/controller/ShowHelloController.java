package me.anthony.controller;

import me.anthony.feign.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Anthony on 2017/7/29.
 */
@RestController
public class ShowHelloController {

    @Autowired
    private HelloRemote helloRemote;

    @RequestMapping("/hello/{text}")
    public String hello(@PathVariable(required = false) String text) {
        return helloRemote.hello(text);
    }
}
