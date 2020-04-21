package org.hu.service;

import org.hu.entity.Student;

public class StudentServiceImpl implements IStudentService {

	@Override
	public void addStudent(Student stu) {
		System.out.println("add student:" + stu.getName() + "," + stu.getAge());
	}

}