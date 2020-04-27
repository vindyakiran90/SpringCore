package com.tyss.student.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.student.dto.StudentPrimaryInfo;
import com.tyss.student.dto.StudentSecondaryInfo;

public class StudentController {
	
	public static void main(String[] args) {
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("bean.xml");
		
		StudentPrimaryInfo info = context.getBean(StudentPrimaryInfo.class);
		System.out.println("Student name "+info.getStudentName());
		System.out.println("Student Mother's name "+info.getSecondaryInfo().getMotherName());
		
		StudentPrimaryInfo info1 = context.getBean(StudentPrimaryInfo.class);
		StudentSecondaryInfo secondaryInfo = context.getBean(StudentSecondaryInfo.class);
		
		secondaryInfo.setFatherName("Lava");
		secondaryInfo.setMotherName("Lavanya");
		info1.setStudentId(102);
		info1.setStudentName("Manu");
		info1.setContactNumber(9632587412L);
		info1.setSecondaryInfo(secondaryInfo);
		
		System.out.println("Father's name "+info1.getSecondaryInfo().getFatherName());
		System.out.println("Mother's name "+info1.getSecondaryInfo().getMotherName());
		
	}
}
