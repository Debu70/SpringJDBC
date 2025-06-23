package com.codeD.springJDBC.secondApp;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.codeD.springJDBC.secondApp.StudentDAO.StudentDAO;
import com.codeD.springJDBC.secondApp.StudentDAO.StudentDaoImpl;
import com.codeD.springJDBC.secondApp.enity.StudentEntity;

@Configuration
@ComponentScan(basePackages = {"com.codeD.springJDBC.secondApp"})
public class JdbcConfig {
	
	//for mysql jdbc config
	@Bean(name= {"dataSource_bean"})
	public DataSource getJdbcConfig() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		//ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql:///springjdbc");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	
	@Bean(name= {"jdbcTemplate_bean"})
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getJdbcConfig());
		return jdbcTemplate;
	}
	
	
	//for Manual Bean
//	@Bean(name= {"StudentDaobean"})
//	public StudentDAO getstudentEntity() {
//		StudentDaoImpl studentDao = new StudentDaoImpl();
//		studentDao.setStudentJdbcTemplate(getJdbcTemplate());
//		return studentDao;
//	}
	
}
