package com.test.ash.redis.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.test.ash.redis.dao.MyuserDao;
import com.test.ash.redis.service.MyuserService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

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

    /**
     * 通过名称name查询单条数据
     *
     * @param name 名称
     * @return 单条数据
     */
    @Transactional(propagation= Propagation.SUPPORTS)
    @GetMapping("/name")
    public R selectOne(@RequestParam("name") String name) {
        return success(myuserDao.getUserByName(name));
    }
}
