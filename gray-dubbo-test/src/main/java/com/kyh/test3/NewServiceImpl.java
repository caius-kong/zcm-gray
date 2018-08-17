package com.kyh.test3;

import org.springframework.stereotype.Service;

import com.kyh.api.NewService;


/**
 * @author kongyunhui on 2018/7/20.
 */
@Service
public class NewServiceImpl implements NewService {
    @Override
    public String newFun() {
        System.out.println("-->new function (app3)");
        return "app3 new fun";
    }
}
