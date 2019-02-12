package com.sqli.spring.service;

import java.util.List;

import com.sqli.spring.beans.Student;

public interface AdminStudentService {
	Student addStudent(Student student);
	List<Student> listStudent();
	Student getStudentById(String cne);
	void deleteStudent(String cne);

}
