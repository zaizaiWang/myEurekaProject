package com.wangsk.EurekaClient.interfaces;

import com.wangsk.EurekaClient.fallBack.HelloClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@FeignClient(value="Eureka-service",fallbackFactory = HelloClientFallback.class)
public interface HelloClient {

    @RequestMapping(value="/getHi",method = RequestMethod.GET)
    public String getHi(String reqStr);

    @PostMapping(value="/postHi")
    public String postHi(String reqStr);
}
