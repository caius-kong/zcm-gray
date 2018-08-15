package com.kyh.test2;
import org.springframework.stereotype.Service;

import com.kyh.api.DemoService;

/**
 * @author kongyunhui on 2018/7/20.
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "hello, " + name;
    }
}
