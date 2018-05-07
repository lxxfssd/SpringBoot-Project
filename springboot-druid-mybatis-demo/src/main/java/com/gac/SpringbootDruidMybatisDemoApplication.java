package com.gac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan   //扫描Servlet (暂时只有druid 的servlet)
public class SpringbootDruidMybatisDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDruidMybatisDemoApplication.class, args);
	}
}
