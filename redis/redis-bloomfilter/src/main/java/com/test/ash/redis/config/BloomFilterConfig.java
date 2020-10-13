package com.test.ash.redis.config;

import com.google.common.base.Charsets;
import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnel;
import com.google.common.hash.PrimitiveSink;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Ashiamd email: ashiamd@foxmail.com
 * @date : 2020/10/13 10:29 下午
 */
@Configuration
public class BloomFilterConfig {

    @Bean
    public BloomFilter<String> bloomFilter(){
        BloomFilter<String> bloomFilter = BloomFilter.create(new Funnel<String>() {
            @Override
            public void funnel(String from, PrimitiveSink into) {
                into.putString(from, Charsets.UTF_8);
            }
        },100_0000,0.01);
        // 初始化bloom-fliter。
        for(int i = 1;i<=100_0000;++i){
            bloomFilter.put("name_"+i);
        }
        return bloomFilter;
    }
}
