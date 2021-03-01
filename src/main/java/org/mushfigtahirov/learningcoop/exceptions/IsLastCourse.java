package org.mushfigtahirov.learningcoop.exceptions;

// This class creates custom exception which warns when admin deletes last course
// The custom exception implemented in CourseController class delete method
public class IsLastCourse extends Exception {

	
	private static final long serialVersionUID = 1L;

	public IsLastCourse() {
		super("This is the last course in your course list.");
	}

	public IsLastCourse(String message) {
		super(message);
	}
	
	

}
