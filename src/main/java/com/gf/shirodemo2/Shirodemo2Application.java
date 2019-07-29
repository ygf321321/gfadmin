package com.gf.shirodemo2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.gf.shirodemo2.dao")
@SpringBootApplication
public class Shirodemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Shirodemo2Application.class, args);
	}

}
