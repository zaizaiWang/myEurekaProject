package com.wangsk.EurekaClient.controller;

import com.wangsk.EurekaClient.service.HelloService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags="测试微服务")
public class HelloController {

    private final static Logger log = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    HelloService helloService;

    @RequestMapping(value="/higet")
    @ApiOperation("get方法测试")
    public  String getHi(@RequestParam String reqStr){
        log.info("消费者get方法入参{}",reqStr);
        return helloService.getHi(reqStr);
    }

    @PostMapping(value="/hipost")
    @ApiOperation("post方法测试")
    public  String postHi(@RequestParam String reqStr){
        log.info("消费者post方法入参{}",reqStr);
        return helloService.postHi(reqStr);
    }

}
