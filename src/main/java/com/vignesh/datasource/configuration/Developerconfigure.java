package com.vignesh.datasource.configuration;

import java.sql.DriverManager;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
@Profile("developer")

public class Developerconfigure {
	@Value("${developer.datasource.url}")
	private String url;
	@Value("${developer.datasource.username}")
	private String username;
	@Value("${developer.datasource.password}")
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
