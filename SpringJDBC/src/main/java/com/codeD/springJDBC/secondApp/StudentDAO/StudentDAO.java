package com.codeD.springJDBC.secondApp.StudentDAO;

import java.util.List;

import com.codeD.springJDBC.secondApp.enity.StudentEntity;

public interface StudentDAO {

	// only having Methods no -> method body only signature and parameter
	// For Non-select Query
	public int insert(StudentEntity studentEntity);

	public int updtae(StudentEntity studentEntity);

	public int delete(StudentEntity studentEntity);

	// for select query
	public StudentEntity getStudent(int studentId);

	// for get all table
	public List<StudentEntity> getAllStudent();
}
