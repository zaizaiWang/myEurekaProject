package com.wangsk.EurekaClient.fallBack;

import com.wangsk.EurekaClient.interfaces.HelloClient;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class HelloClientFallback implements FallbackFactory<HelloClient> {
    @Override
    public HelloClient create(Throwable cause) {
        return null;
    }
}
