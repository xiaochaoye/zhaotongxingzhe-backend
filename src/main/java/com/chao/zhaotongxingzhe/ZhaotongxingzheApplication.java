package com.chao.zhaotongxingzhe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.chao.zhaotongxingzhe.mapper")
@EnableScheduling
public class ZhaotongxingzheApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhaotongxingzheApplication.class, args);
    }

}
