package com.gls.studentMS.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gls.studentMS.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	List<Student> findByCountryContainsAndCourseContainsAllIgnoreCase(String course,String country);
	
}