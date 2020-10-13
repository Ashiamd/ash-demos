package com.test.ash.redis.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.google.gson.Gson;
import com.test.ash.redis.dao.MyuserDao;
import com.test.ash.redis.entity.Myuser;
import com.test.ash.redis.utils.RedisUtil;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;
import javax.management.Query;
import java.io.Serializable;
import java.util.List;

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

    /**
     * 通过名称name查询单条数据
     *
     * @param name 名称
     * @return 单条数据
     */
    @Transactional(propagation = Propagation.SUPPORTS)
    @GetMapping("/name")
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


}
