package com.designpattern.data.mapper;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class App {
	private static Logger logger = LoggerFactory.getLogger(App.class);
	
	public static void main(final String... args) {
		final StudentDataMapper mapper = new StudentDataMapperImpl();

		Student student = new Student(1, "Adam", 'A');

		mapper.insert(student);

		logger.info("App.main(), student : " + student + ", is inserted");

		final Optional<Student> studentToBeFound = mapper.find(student.getStudentId());

		logger.info("App.main(), student : " + studentToBeFound + ", is searched");

		student = new Student(student.getStudentId(), "AdamUpdated", 'A');

		mapper.update(student);

		logger.info("App.main(), student : " + student + ", is updated");
		logger.info("App.main(), student : " + student + ", is going to be deleted");

		mapper.delete(student);
	}

	private App() {
	}
}