package com.kyh.test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.rpc.RpcContext;
import com.kyh.api.DemoService;

/**
 * @author kongyunhui on 2018/8/15.
 */
@RestController
@RequestMapping("app1")
public class MyController {
    @Autowired
    private DemoService demoService;

    @RequestMapping("/")
    public ResponseEntity<String> dubboCaller() {
//        RpcContext.getContext().setAttachment("clientIP", "2");
        String str = demoService.sayHello("kong");
        return new ResponseEntity<String>(str, HttpStatus.OK);
    }
}
