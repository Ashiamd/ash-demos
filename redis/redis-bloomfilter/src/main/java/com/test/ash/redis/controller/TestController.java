package com.test.ash.redis.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.google.common.hash.BloomFilter;
import com.google.gson.Gson;
import com.test.ash.redis.dao.MyuserDao;
import com.test.ash.redis.entity.Myuser;
import com.test.ash.redis.utils.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;
import javax.management.Query;
import java.io.Serializable;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/test")
public class TestController extends ApiController {

    /**
     * 服务对象
     */
    @Resource
    private MyuserDao myuserDao;

    @Resource
    private RedisUtil redisUtil;

    @Resource
    private BloomFilter bloomFilter;

    /**
     * 通过名称name查询单条数据
     *
     * 没有bloom-fliter，无对应数据时，Redis无->MySQL无
     *
     * @param name 名称
     * @return 单条数据
     */
    @Transactional(propagation = Propagation.SUPPORTS)
    @GetMapping("/name01")
    public R selectOneV1(@RequestParam("name") String name) {
        // (1) Redis尝试获取数据
        String json = redisUtil.getVal(name);
        if (json != null) {
            return success(new Gson().fromJson(json, Myuser.class));
        } else {
            // (2) Redis无数据，从MySQL获取数据，若存在数据则缓存到Redis
            Myuser myuser = myuserDao.getUserByName(name);
            if (myuser != null) {
                json = new Gson().toJson(myuser);
                redisUtil.setVal(name, json);
            }
            return success(myuser);
        }
    }

    /**
     * 通过名称name查询单条数据
     *
     * 有bloom-fliter，无对应数据时，直接返回null
     *
     * @param name 名称
     * @return 单条数据
     */
    @Transactional(propagation = Propagation.SUPPORTS)
    @GetMapping("/name02")
    public R selectOneV2(@RequestParam("name") String name) {
        // (0) 先bloom-filter判断是否存在对应的数据，存在则继续查找，否则返回null
        if(!bloomFilter.mightContain(name)){
            logger.debug("不存在name为 "+ name +" 的数据");
            return success(null);
        }

        // (1) Redis尝试获取数据
        String json = redisUtil.getVal(name);
        if (json != null) {
            return success(new Gson().fromJson(json, Myuser.class));
        } else {
            // (2) Redis无数据，从MySQL获取数据，若存在数据则缓存到Redis
            Myuser myuser = myuserDao.getUserByName(name);
            if (myuser != null) {
                json = new Gson().toJson(myuser);
                redisUtil.setVal(name, json);
            }
            return success(myuser);
        }
    }


}
