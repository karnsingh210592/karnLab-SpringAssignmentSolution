package com.gls.studentMS.service;

import java.util.List;

import com.gls.studentMS.entity.Student;
import com.gls.studentMS.repository.StudentRepository;
import com.gls.studentMS.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {


	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		List<Student> students=studentRepository.findAll();
		return students;
	}

	@Override
	public Student findById(int theId) {
		// TODO Auto-generated method stub
		return studentRepository.findById(theId).get();
	}

	@Override
	public void save(Student theStudent) {
		// TODO Auto-generated method stub
		studentRepository.save(theStudent);
		
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(theId);
		
	}

	@Override
	public List<Student> searchBy(String course, String country) {
		// TODO Auto-generated method stub
		List<Student> students=studentRepository.findByCountryContainsAndCourseContainsAllIgnoreCase(course, country);
		return students;
	}





}