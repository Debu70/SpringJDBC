package com.codeD.springJDBC.FirstApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {

		System.out.println("Program Running Successfully !...");

		// SpringJDBC -> Usng JdbcTemplate class

		// create a context
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/codeD/springJDBC/FirstApp/student-config.xml");
		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
		
		
		//prepare a insert query
		String query = "insert into student_tab values(?,?,?)";
		
		//fire query
		
		int InsertRow = template.update(query,104,"K MangaRaju", "Tirupur");
		
		System.out.println(InsertRow+" No. of row affected");

	}
}
