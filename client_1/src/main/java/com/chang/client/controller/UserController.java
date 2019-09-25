package com.chang.client.controller;

import com.crossoverjie.distributed.annotation.ControllerLimit;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author chang
 * @Date 2019/6/14
 * @Description
 */
@RestController
public class UserController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
//    @ControllerLimit
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }

    /**
     * 登录页面
     * @return
     */
    @GetMapping("/login")
    public String login() {
        // 这里返回的login指的是src/main/resources/templates目录下的login.html
        // 因此，我们需要在src/main/resources/templates目录下新建一个login.html
        // 当我们通过浏览器访问localhost:8080/login时即可访问到我们编写的login.html
        return "index";
    }
    @GetMapping("/login1")
    public String login1() {
        // 这里返回的login指的是src/main/resources/templates目录下的login.html
        // 因此，我们需要在src/main/resources/templates目录下新建一个login.html
        // 当我们通过浏览器访问localhost:8080/login时即可访问到我们编写的login.html
        return "utf8-jsp/index";
    }

}
