package com.yqh.cache.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yqh.cache.dao.jpa.StudentDao;
import com.yqh.cache.entity.Student;

@Service
public class StudentService {

	@Autowired
    private StudentDao studentDao;
	
    public void addStudent(Student student){
        studentDao.save(student);
    }
 
    public void  updateStudent(Student student){
        studentDao.save(student);
    }
    
    public void deleteStudentById(Long id){
        studentDao.deleteById(id);
    }
 
    public List<Student> findAll(){
        return studentDao.findAll();
    }
    
    public Student findStudentById(Long id){
        return studentDao.findById(id).get();
    }
    
    public List<Student> findStudentByName(String name){
        return studentDao.findByName(name);
    }

	
}
