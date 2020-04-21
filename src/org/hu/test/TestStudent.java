package org.hu.test;

import org.hu.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
	
	public static void main(String[] args) {
		createStudentByCommon();
		createStudentByIOC();
	}

	private static void createStudentByCommon() {
		Student student = new Student();
		student.setNo("s-001");
		student.setName("zhangsan");
		student.setAge(21);
		System.out.println(student);
	}
	
	private static void createStudentByIOC() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = (Student)context.getBean("stu_2");
		System.out.println(student);
	}
	
}
