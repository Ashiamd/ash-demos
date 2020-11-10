package com.test.ash.redis.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.test.ash.redis.entity.Myuser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * (Myuser)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-12 00:30:27
 */
public interface MyuserDao extends BaseMapper<Myuser> {

    @Select("SELECT id,name FROM myuser WHERE name = #{name}")
    public Myuser getUserByName(@Param("name") String name);
}