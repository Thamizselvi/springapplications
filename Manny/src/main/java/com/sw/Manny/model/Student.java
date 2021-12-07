package com.sw.Manny.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name="student_id")
    private Long student_id;

    private String name;
    private int age;
    private String grade;
    
   
    @ManyToMany(targetEntity = Course.class, mappedBy = "student", cascade = CascadeType.ALL)
    @JsonBackReference
    
    private List<Course> course;
    
   
    public Student() {
    }

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

	public Long getId() {
		return student_id;
	}

	public void setId(Long student_id) {
		this.student_id = student_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}
    
}
