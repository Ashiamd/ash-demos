package demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import demo.dao.TestDao;
import demo.entity.Test;
import demo.service.TestService;
import org.springframework.stereotype.Service;

/**
 * (Test)表服务实现类
 *
 * @author ashiamd
 * @since 2020-11-10 13:15:35
 */
@Service("testService")
public class TestServiceImpl extends ServiceImpl<TestDao, Test> implements TestService {

}