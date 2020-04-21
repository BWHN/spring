package org.hu.test;

import org.hu.entity.Student;
import org.hu.service.IStudentService;
import org.hu.service.StudentServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLog {
	
	public static void main(String[] args) {
		LogBeforeByCommon();
		LogBeforeByAOP();
	}

	private static void LogBeforeByCommon() {
		IStudentService iStudentService = new StudentServiceImpl();
		Student stu = new Student();
		stu.setName("wangwu");
		stu.setAge(25);
		System.out.println("start to add student...");
		iStudentService.addStudent(stu);
	}
	
	private static void LogBeforeByAOP() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IStudentService iStudentService = (IStudentService)context.getBean("stuSerImp");
		iStudentService.addStudent((Student)context.getBean("stu_2"));
	}
	
}
