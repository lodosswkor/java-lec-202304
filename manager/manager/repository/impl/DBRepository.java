package manager.repository.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import grade.connect.MariaDbConnect;
import manager.entity.Student;
import manager.repository.Repository;

public class DBRepository implements Repository {

	//-- R
	@Override
	public List<Student> selectStudents() throws SQLException {
		return null;
	}

	@Override
	public Student selectStudent(int stdNo) throws SQLException {
		return null;
	}

	@Override
	public List<Student> selectStudent(String name) throws Exception {
		return null;
	}

	@Override
	public Student lastInsertedStudent() throws Exception {
		return null;
	}

	//--- C

	@Override
	public boolean registStudent(Student student) throws SQLException {
		return 0;
	}

	@Override
	public int updateStudent(int stdNo, Student student) throws SQLException {
		return 0;

	}

	@Override
	public boolean deleteStudent(int stdNo) throws Exception {
		return false;
	}

	@Override
	public void closeRepository() throws Exception {
	}

}
