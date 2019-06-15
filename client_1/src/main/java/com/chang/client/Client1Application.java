package com.chang.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *  error记录：产品服务端的启动类，因为我们使用的是SpringBoot的注解进行扫描的，
 *  @SpringBootApplication是扫描当前启动类所在的包的类及其子包的类，当引入的fegin接口和回调函数需要在和启动类平级或在其子包内
 */
@SpringBootApplication
@EnableEurekaClient
public class Client1Application {

    public static void main(String[] args) {
        SpringApplication.run(Client1Application.class, args);
    }

}
