package com.car;

import java.util.Properties;

import javax.inject.Inject;
import javax.persistence.EntityManagerFactory;
import javax.sql.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@PropertySource(value = "classpath:application.properties")
public class JPAConfig {
	@Autowired
	private Environment env;

	@Bean
	public LocalContainerEntityManagerFactoryBean emf() {

		LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
		emf.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		emf.setDataSource(getDatasource());
		emf.setPackagesToScan("com.car.Entity");
		emf.setJpaProperties(jpaProperties());
		return emf;

	}

	@Bean
	public DataSource getDatasource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl(env.getProperty("db.url"));
		ds.setUsername(env.getProperty("db.username", "root"));
		ds.setPassword(env.getProperty("db.password", "root"));
		return ds;
	}

	private Properties jpaProperties() {
		Properties prop = new Properties();
		prop.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		//org.hibernate.dialect.MySQL5Dialect
		prop.setProperty("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl")); // database create, validate,
																							// create-drop
		prop.setProperty("hibernate.show_sql", env.getProperty("hibernate.show.sql"));
		//prop.setProperty("hibernate.format_sql", env.getProperty("hibernate.format.sql"));

		return prop;

	}
@Bean
@Inject
	public PlatformTransactionManager tranxManager(EntityManagerFactory emf) {
		return new JpaTransactionManager(emf);

	}
}
