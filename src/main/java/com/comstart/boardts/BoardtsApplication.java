package com.comstart.boardts;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.comstart")
//@SpringBootApplication
@MapperScan("com.comstart.mapper")
public class BoardtsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardtsApplication.class, args);
	}

}
