package com.kyh.test3G;

import org.springframework.stereotype.Service;

import com.kyh.api.NewService;


/**
 * @author kongyunhui on 2018/7/20.
 */
@Service
public class NewServiceImplGray implements NewService {
    @Override
    public String newFun() {
        System.out.println("-->new function (app3 gray)");
        return "app3 gray new fun";
    }
}
