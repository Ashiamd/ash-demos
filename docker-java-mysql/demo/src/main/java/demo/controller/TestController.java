package demo.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import demo.entity.Test;
import demo.service.TestService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Test)表控制层
 *
 * @author ashiamd
 * @since 2020-11-10 13:15:36
 */
@RestController
@RequestMapping("test")
public class TestController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private TestService testService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param test 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<Test> page, Test test) {
        return success(this.testService.page(page, new QueryWrapper<>(test)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.testService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param test 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody Test test) {
        return success(this.testService.save(test));
    }

    /**
     * 修改数据
     *
     * @param test 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody Test test) {
        return success(this.testService.updateById(test));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.testService.removeByIds(idList));
    }
}