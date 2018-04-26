package com.gac;

import com.gac.dbconfig.DBConfig1;
import com.gac.dbconfig.DBConfig2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@ComponentScan(basePackages = {"com.gac.dbconfig","com.gac.controller",
		"com.gac.test01", "com.gac.test02", "com.gac.datasource", "com.gac.log", "com.gac.scheduler"})
@EnableCaching //开启缓存注解
@EnableConfigurationProperties(value = {DBConfig1.class, DBConfig2.class})
//@EnableScheduling //开启定时任务注解
@EnableAsync //开启异步调用
@EnableAutoConfiguration
public class SpringbootManydatasourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootManydatasourceApplication.class, args);
	}
}
