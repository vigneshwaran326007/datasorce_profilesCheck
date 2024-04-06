package com.vignesh.datasource.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@Profile("tester")

public class Testerconfiguer {
	
	@Value("${tester.datasource.url}")
	private String url;
	@Value("${tester.datasource.username}")
	private String username;
	@Value("${tester.datasource.password}")
	private String password;
	
	@Bean
	public DataSource data() {
		DriverManagerDataSource dbsource = new DriverManagerDataSource();
		dbsource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dbsource.setUrl(url);
		dbsource.setPassword(password);
		dbsource.setUsername(username);
		return dbsource;
		

	}
	

}
