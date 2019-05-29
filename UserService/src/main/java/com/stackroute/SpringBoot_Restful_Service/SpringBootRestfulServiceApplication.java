package com.stackroute.SpringBoot_Restful_Service;

import lombok.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootRestfulServiceApplication {
	public static void main(String[] args) {

		SpringApplication.run(SpringBootRestfulServiceApplication.class, args);
	//	System.out.println(msg);
	}

}
	@RefreshScope
	@RestController
	class MessageRestController {
//
//		@Value("${msg:Hello world - Config Server is not working..pelase check}")
//		private String msg;

		@RequestMapping
		String getMsg() {
			String msg;
			msg = "hello world";
			return msg;

		}
	}


