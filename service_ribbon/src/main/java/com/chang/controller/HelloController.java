package com.chang.controller;

import com.chang.service.HelloService;
import com.crossoverjie.distributed.annotation.CommonLimit;
import com.crossoverjie.distributed.annotation.ControllerLimit;
import com.crossoverjie.distributed.limit.RedisLimit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author chang
 * @Date 2019/6/14
 * @Description
 */
@RestController
//@ComponentScan(value = "com.crossoverjie.distributed.intercept")
public class HelloController {

    private int a = 0;

    @Autowired
    HelloService helloService;

    @Resource
    RedisLimit redisLimit;

    @GetMapping(value = "/hi")
    @CommonLimit
    public String getData (@RequestParam String name) {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        System.out.println(redisLimit.limit());


//        for (int i = 0; i < 300; i++) {
//            cachedThreadPool.execute(new Runnable() {
//                @Override
//                public void run() {
//                    helloService.getData(name);
//                    System.out.println(Thread.currentThread());
//                }
//            });
//        }
//        a += 1;
//        System.out.println(a);
        System.out.println(System.currentTimeMillis());
        return null;
    }
}
