package com.test.ash.redis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author ashiamd
 */
@SpringBootApplication
@MapperScan("com.test.ash.redis.dao")
public class RedisBloomfilterApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisBloomfilterApplication.class, args);
    }

}
