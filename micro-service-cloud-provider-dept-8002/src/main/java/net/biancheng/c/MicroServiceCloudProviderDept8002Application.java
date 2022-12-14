package net.biancheng.c;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "net.biancheng.c")
@EnableEurekaClient // Spring cloud Eureka 客户端，自动将本服务注册到 Eureka Server 注册中心中
public class MicroServiceCloudProviderDept8002Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceCloudProviderDept8002Application.class, args);
    }
}