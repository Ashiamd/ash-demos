package com.test.ash.redis.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 * (Myuser)表实体类
 *
 * @author makejava
 * @since 2020-10-12 00:30:09
 */
@Data
public class Myuser extends Model<Myuser> implements Serializable{

    private static final long serialVersionUID = 1L;

    //自增主键
    private Integer id;
    //模拟数据
    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}