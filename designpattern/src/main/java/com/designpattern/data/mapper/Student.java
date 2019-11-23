package com.designpattern.data.mapper;

import java.io.Serializable;

public final class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	private int studentId;
	private String name;
	private char grade;
	
	public Student(final int studentId, final String name, final char grade) {
		super();

		this.studentId = studentId;
		this.name = name;
		this.grade = grade;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(final int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public char getGrade() {
		return grade;
	}
	
	public void setGrade(final char grade) {
		this.grade = grade;
	}

	public boolean equals(final Object inputObject) {
		boolean isEqual = false;
		
		if (this == inputObject) {
			isEqual = true;
		} else if (inputObject != null && getClass() == inputObject.getClass()) {
			final Student inputStudent = (Student) inputObject;
			
			if (this.getStudentId() == inputStudent.getStudentId()) {
				isEqual = true;
			}
		}
		return isEqual;
	}
	
	public int hashCode() {
		return this.getStudentId();
	}

	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", grade=" + grade + "]";
	}
}