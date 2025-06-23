package com.codeD.springJDBC.secondApp.StudentDAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.codeD.springJDBC.secondApp.enity.StudentEntity;

public class RowMapperImpl implements RowMapper<StudentEntity> {

	@Override
	public StudentEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		StudentEntity studentEntity = new StudentEntity();
		studentEntity.setStudent_id(rs.getInt(1));
		studentEntity.setStudent_name(rs.getString(2));
		studentEntity.setStudent_address(rs.getString(3));
		return studentEntity;
	}

}
