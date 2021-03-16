package com.pwq.springbootredis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import redis.clients.jedis.Jedis;

@SpringBootTest
class SpringBootRedisApplicationTests {

    @Test
    void contextLoads() {
    }
    @Test
    public void test1(){
        Jedis jedis = new Jedis("192.168.216.141",6379);
        jedis.set("name","123");
        System.out.println(jedis.get("name"));
    }
}
