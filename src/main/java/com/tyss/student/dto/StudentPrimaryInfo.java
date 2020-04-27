package com.tyss.student.dto;

import lombok.Data;

@Data

public class StudentPrimaryInfo {
	private int studentId;
	private String studentName;
	private long contactNumber;
	private StudentSecondaryInfo secondaryInfo;
}
