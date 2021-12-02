package com.aisino.redis_springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuxiang
 * @date 2021/12/2 9:11 上午
 */
@RestController
@RequestMapping("/redisTest")
public class RedisTestController {

    @Autowired
    private RedisTemplate redisTemplate;


    @GetMapping("/index")
    public String testRedis(){
        redisTemplate.opsForValue().set("name","lili");
        String name = (String) redisTemplate.opsForValue().get("name");
        return name;
    }
}
