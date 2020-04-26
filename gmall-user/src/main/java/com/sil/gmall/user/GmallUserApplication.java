package com.sil.gmall.user;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.sil.gmall.user.mapper")// 添加对mapper包扫描
public class GmallUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(GmallUserApplication.class, args);
    }

}
