package com.yqh.cache.dao.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import com.yqh.cache.entity.Student;
import java.util.List;

public interface StudentDao extends JpaRepository<Student,Long> {
	
    public List<Student> findByName(String name);

}