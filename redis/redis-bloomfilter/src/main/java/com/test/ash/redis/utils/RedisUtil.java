package com.test.ash.redis.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.params.SetParams;

import javax.annotation.Resource;

@Component
@Slf4j
public class RedisUtil {

    @Resource
    private JedisPool jedisPool;

    /**
     * 返回指定key对应的value (这里简单demo，所以直接获取的就是json数据)
     *
     * @param key
     * @return
     */
    public String getVal(String key) {

        String res = null;
        try(Jedis jedis = jedisPool.getResource()){
            res = jedis.get(key);
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return res;
    }

    /**
     * 这里按照key存对应的value,缓存5min (这里简单demo，所以直接存json数据)
     *
     * @param key
     * @param value
     */
    public void setVal(String key, String value) {
        try (Jedis jedis = jedisPool.getResource()) {
            jedis.select(0);
            jedis.set(key, value, SetParams.setParams().ex(300000));
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }


}
