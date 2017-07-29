package me.anthony.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Anthony on 2017/7/29.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(@RequestParam(required = false, defaultValue = "") String text) {
        if (text.isEmpty())
            return "Hello World";
        else
            return "Hello" + text;
    }
}
