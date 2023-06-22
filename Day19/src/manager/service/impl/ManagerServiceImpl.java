package manager.service.impl;

import manager.entity.Student;
import manager.service.ManagerService;
import manager.repository.Repository; 
import manager.repository.impl.DBRepository;

import java.util.List;

public class ManagerServiceImpl implements ManagerService {

	//-- Repository 객체 생성 
	//-- 불변객체 
	private final Repository repository = new DBRepository(); 
	
    @Override
    public Student registerStudent(Student student) throws Exception {
        return null;
    }

    @Override
    public Student modifyStudent(Student student) throws Exception {
        return null;
    }

    @Override
    public List<Student> searchStudents(Student student) throws Exception {
    	
    	List<Student> list  = null; 
    	
    	if( student == null ) { 
        	// 조건 1. 전체를 조회한다 
    		list = repository.selectStudents();
    	} else {
	    	// 조건 2. 학생이름을 검색어로 조회한다. 
	    	list = repository.selectStudent(student.getName());
    	}
    	
        return list;
    }

    @Override
    public boolean deleteStudent(int stdNo) throws Exception {
        return false;
    }

    @Override
    public void closeService() throws Exception {

    }
}
