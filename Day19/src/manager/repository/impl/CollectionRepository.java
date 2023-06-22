package manager.repository.impl;

import java.sql.SQLException;
import java.util.List;

import manager.entity.Student;
import manager.repository.Repository;

public class CollectionRepository implements Repository {


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

	@Override
	public boolean registStudent(Student student) throws SQLException {
		return false;
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
