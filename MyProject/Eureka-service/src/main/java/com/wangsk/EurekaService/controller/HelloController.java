package com.wangsk.EurekaService.controller;

import com.wangsk.EurekaService.service.HelloService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @Autowired
    HelloService helloService;

    @RequestMapping(value="/getHi")
    @ApiOperation("服务提供者get方法")
    public String getHi(@RequestParam String reqStr){
        return helloService.getHi(reqStr);
    }

    @PostMapping(value="/postHi")
    @ApiOperation("服务提供者post方法")
    public String postHi(@RequestParam String reqStr){
        return helloService.postHi(reqStr);
    }
}
