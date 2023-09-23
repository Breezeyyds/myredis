package com.example.myredis;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
@Slf4j
class MyredisApplicationTests {
    @Autowired
   private StringRedisTemplate ridisTemplate;
    @Test
    void contextLoads() {
        ridisTemplate.opsForValue().set("k1","ssss");
        String k1 = ridisTemplate.opsForValue().get("k1");
        log.info("hallo",k1);
        System.out.println(k1);
        System.out.println("");


    }

}
