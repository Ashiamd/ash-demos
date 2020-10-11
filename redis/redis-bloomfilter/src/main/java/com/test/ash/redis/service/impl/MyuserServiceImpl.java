package com.test.ash.redis.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.test.ash.redis.dao.MyuserDao;
import com.test.ash.redis.entity.Myuser;
import com.test.ash.redis.service.MyuserService;
import org.springframework.stereotype.Service;

/**
 * (Myuser)表服务实现类
 *
 * @author makejava
 * @since 2020-10-12 00:30:29
 */
@Service("myuserService")
public class MyuserServiceImpl extends ServiceImpl<MyuserDao, Myuser> implements MyuserService {

}