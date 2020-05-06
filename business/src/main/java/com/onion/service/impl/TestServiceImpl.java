package com.onion.service.impl;

import com.onion.model.Test;
import com.onion.dao.TestMapper;
import com.onion.service.ITestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yu
 * @since 2020-05-06
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {

}
