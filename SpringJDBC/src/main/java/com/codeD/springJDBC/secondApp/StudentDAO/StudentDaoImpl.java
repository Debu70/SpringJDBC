package com.codeD.springJDBC.secondApp.StudentDAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.codeD.springJDBC.secondApp.enity.StudentEntity;


@Component("StudentDaobean")
public class StudentDaoImpl implements StudentDAO {
	
	@Autowired
	private JdbcTemplate studentJdbcTemplate;

	@Override
	public int insert(StudentEntity studentEntity) {
		// Write b.logic

		// create insert query
		String query = "insert into student_tab values(?,?,?)";

		// data collect from AppTest/ setter data
		int InsertRow = this.studentJdbcTemplate.update(query, studentEntity.getStudent_id(),
				studentEntity.getStudent_name(), studentEntity.getStudent_address());

		return InsertRow;
	}

	@Override
	public int updtae(StudentEntity studentEntity) {

		// prepare a update Query
		String query = "update student_tab set student_name=?, student_address=? where student_id=?";
		int updateRow = this.studentJdbcTemplate.update(query, studentEntity.getStudent_name(), studentEntity.getStudent_address(),
				studentEntity.getStudent_id());

		return updateRow;
	}
	
	@Override
	public int delete(StudentEntity studentEntity) {
		//prepare delete query operation
		String query = "delete student_tab where student_id=?";
		int deleteRow = this.studentJdbcTemplate.update(query, studentEntity.getStudent_id());
		
		
		return deleteRow;
	}
	
	@Override
	public StudentEntity getStudent(int student_id) {
		
		//prepare a select query for get a row from DB
		String query= "select * from student_tab where student_id=?";
		//create a rowMapper obj
		RowMapper<StudentEntity> rowMapper = new RowMapperImpl();
		
		StudentEntity getStudent = this.studentJdbcTemplate.queryForObject(query, rowMapper, student_id);
		return getStudent;

	}
	
	@Override
	public List<StudentEntity> getAllStudent() {
		
		//prepare Query
		String query = "select * from student_tab";
		
		RowMapper<StudentEntity> rowMapper =  new RowMapperImpl();
		List<StudentEntity> getAllStudent_tab = this.studentJdbcTemplate.query(query, rowMapper);
		
		return getAllStudent_tab;
	}


	
	
	public JdbcTemplate getStudentJdbcTemplate() {
		return studentJdbcTemplate;
	}

	public void setStudentJdbcTemplate(JdbcTemplate studentJdbcTemplate) {
		this.studentJdbcTemplate = studentJdbcTemplate;
	}

	
	
}
