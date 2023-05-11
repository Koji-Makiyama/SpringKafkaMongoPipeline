package com.kojimakiyama.datapipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DatapipelineApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatapipelineApplication.class, args);
	}

}
