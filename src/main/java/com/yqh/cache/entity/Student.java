package com.yqh.cache.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name = "t_student")
public class Student {
	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) // 主键由数据库自动生成（主要是自动增长型）
    @Column(name = "id", length = 32)
    private Long id;
    
    @Column(length = 50)
    private String name;
    
    @Column(length = 3)
    private Integer age;
 
    public Student() {
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public Integer getAge() {
        return age;
    }
 
    public void setAge(Integer age) {
        this.age = age;
    }
}
