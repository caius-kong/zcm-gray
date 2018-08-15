package com.kyh.test2G;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kyh.api.DemoService;
import com.kyh.api.NewService;


/**
 * @author kongyunhui on 2018/7/20.
 */
@Service
public class DemoServiceImplGray implements DemoService {
    @Autowired
    private NewService newService;

    @Override
    public String sayHello(String name) {
        String s = newService.newFun();
        return "hello, " + name + "(gray), " + s;
    }
}
