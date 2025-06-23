package com.codeD.springJDBC.secondApp;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codeD.springJDBC.secondApp.StudentDAO.StudentDAO;
import com.codeD.springJDBC.secondApp.StudentDAO.StudentDaoImpl;
import com.codeD.springJDBC.secondApp.enity.StudentEntity;

public class AppTest {

	public static void main(String[] args) {

		System.out.println("Application Running ...!");

		
		//for xml confi	
//		ApplicationContext context = new ClassPathXmlApplicationContext(
//			"com/codeD/springJDBC/secondApp/student-config.xml");
		
		//for annotation config
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		
		StudentDAO student_insert = context.getBean("StudentDaobean", StudentDAO.class);
		StudentDAO student_update = context.getBean("StudentDaobean", StudentDAO.class);
		StudentDAO student_delete = context.getBean("StudentDaobean", StudentDAO.class);
		StudentDAO getSingleStudent = context.getBean("StudentDaobean", StudentDAO.class);
		StudentDAO getALlSingleStudent = context.getBean("StudentDaobean", StudentDAO.class);

		// For Insert

//		StudentEntity studentEntityInsert = new StudentEntity();
//		studentEntityInsert.setStudent_id(108);
//		studentEntityInsert.setStudent_name("Vipul R");
//		studentEntityInsert.setStudent_address("Bihar");
//
//		int DBRowInsert = student_insert.insert(studentEntityInsert);
//		System.out.println(DBRowInsert+ " no. of row affected");

		// for Update

//		StudentEntity studentEntityUpdate = new StudentEntity();
//		studentEntityUpdate.setStudent_id(107);
//		studentEntityUpdate.setStudent_name("Vipul R Srivastav");
//		studentEntityUpdate.setStudent_address("Karnataka");
//		
//		
//		int DBRowUpdate = student_update.updtae(studentEntityUpdate);
//		System.out.println(DBRowUpdate+ " no. of row affected");

		// for Delete
//		
//		StudentEntity studentEntityDelete = new StudentEntity();
//		studentEntityDelete.setStudent_id(107);
//		
//		int DBRowDelete = student_delete.delete(studentEntityDelete);
//		System.out.println(DBRowDelete+ " no. of row Delete");
//		
		// for get single Student by primary Key
//		StudentEntity get_single_Student = getSingleStudent.getStudent(102);
//		System.out.println(get_single_Student);

		// for get all student_tab Value
		List<StudentEntity> getAllTab = getALlSingleStudent.getAllStudent();
		for (StudentEntity studentEntity : getAllTab) {
			System.out.println(studentEntity);
		}
	}
}