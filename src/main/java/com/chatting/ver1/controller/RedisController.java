package com.chatting.ver1.controller;

import com.chatting.ver1.service.RedisSampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {
    @Autowired
    private RedisSampleService redisSampleService;
    @PostMapping(value = "/getRedisStringValue")
    public void getRedisStringValue(String key) {

        redisSampleService.getRedisStringValue(key);
    }

}

