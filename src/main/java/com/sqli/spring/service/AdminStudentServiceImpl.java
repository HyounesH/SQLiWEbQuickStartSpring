package com.sqli.spring.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.sqli.spring.beans.Student;

@Service
public class AdminStudentServiceImpl implements AdminStudentService {
	Map<String, Student> students=new HashMap<String, Student>();

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		students.put(student.getCne(), student);
		return student;
	}

	@Override
	public List<Student> listStudent() {
		// TODO Auto-generated method stub
		List<Student> listStudents=new ArrayList<Student>(students.values());
		return listStudents;
	}

	@Override
	public void deleteStudent(String cne) {
		students.remove(cne);
		
	}

	@Override
	public Student getStudentById(String cne) {
		// TODO Auto-generated method stub
		return students.get(cne);
	}

}
