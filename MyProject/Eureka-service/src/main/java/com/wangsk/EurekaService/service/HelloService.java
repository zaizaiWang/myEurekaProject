package com.wangsk.EurekaService.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    private  final static Logger log = LoggerFactory.getLogger(HelloService.class);

    public  String getHi(String reqStr){
        log.info("服务提供者get方法入参{}",reqStr);
        String str = "恭喜你，调用提供者get方法成功！";
        return str;
    }

    public  String postHi(String reqStr){
        log.info("服务提供者post方法入参{}",reqStr);
        String str = "恭喜你，调用提供者post方法成功！";
        return str;
    }
}
