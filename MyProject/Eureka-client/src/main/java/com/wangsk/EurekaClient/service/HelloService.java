package com.wangsk.EurekaClient.service;

import com.wangsk.EurekaClient.interfaces.HelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Autowired
    HelloClient helloClient;

    public String getHi(String reqStr){
        return helloClient.getHi(reqStr);
    }

    public String postHi(String reqStr){
        return helloClient.postHi(reqStr);
    }
}
