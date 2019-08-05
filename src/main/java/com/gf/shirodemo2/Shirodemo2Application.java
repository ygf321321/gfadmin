package com.gf.shirodemo2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan("com.gf.shirodemo2.dao")
@EnableTransactionManagement(proxyTargetClass = true)
@SpringBootApplication
public class Shirodemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Shirodemo2Application.class, args);
	}

}
