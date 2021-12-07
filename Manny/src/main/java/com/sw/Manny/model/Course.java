package com.sw.Manny.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name = "course")
public class Course {
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		
		@Column(name="course_id")
	    private Long course_id;

	    private String title;
	    private double fees;
	    

	        @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	        @JoinTable(name ="student_course", joinColumns = { @JoinColumn(name = "course_id") },
	        inverseJoinColumns = {    @JoinColumn(name = "student_id") })
	    
	    private List<Student> student;

	    public Course() {
	    }

		public Long getCourse_id() {
			return course_id;
		}

		public void setCourse_id(Long course_id) {
			this.course_id = course_id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public double getFees() {
			return fees;
		}

		public void setFees(double fees) {
			this.fees = fees;
		}

		public List<Student> getStudent() {
			return student;
		}

		public void setStudent(List<Student> student) {
			this.student = student;
		}

		public Course(Long course_id, String title, double fees, List<Student> student) {
			super();
			this.course_id = course_id;
			this.title = title;
			this.fees = fees;
			this.student = student;
		}

		@Override
		public String toString() {
			return "Course [course_id=" + course_id + ", title=" + title + ", fees=" + fees + ", student=" + student
					+ "]";
		}


}
