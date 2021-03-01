package org.mushfigtahirov.learningcoop;

import java.util.ArrayList;

import java.util.List;

import org.junit.jupiter.api.Test;

import org.mushfigtahirov.learningcoop.models.Course;
import org.mushfigtahirov.learningcoop.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import org.junit.jupiter.api.Assertions;

@SpringBootTest
class SimpleApplicationTests {
	
	@Autowired
	private CourseRepository courseRepository;
	@Test
	void contextLoads() {
	}
	// This method tests findByCourseName method
	@Test
	void testfindByCourseName() {
		
		List<Course> expected = courseRepository.findByCourseName("Java");
		 List<Course> actual = new ArrayList<>();
		 Course course2 = courseRepository.findById(2).get();
		 actual.add(course2);
		 System.out.println(expected);
		 System.out.println(actual);
		 Assertions.assertEquals(expected, actual);
	}
	
	// This method tests findByInstructorName method
	@Test
	void testfindByInstructorName() {
		
		List<Course> expected = courseRepository.findByInstructorName("Ishita Maheta");
		List<Course> actual = new ArrayList<>();
		Course course3 = courseRepository.findById(3).get();
		actual.add(course3);
		System.out.println(expected);
		System.out.println(actual);
		Assertions.assertEquals(expected, actual); 
	}
	
	// This method tests findByCourseNameContainingIgnoreCase method
	@Test
	void testfindByCourseNameContainingIgnoreCase() {
		
		List<Course> expected = courseRepository.findByCourseNameContainingIgnoreCase("j");
		List<Course> actual = new ArrayList<>();
		Course course4 = courseRepository.findById(2).get();
		actual.add(course4);
		System.out.println(expected);
		System.out.println(actual);
		Assertions.assertEquals(expected, actual);
	}
	
	// This method tests findByInstructorNameContainingIgnoreCase method
	@Test
	void testfindByInstructorNameContainingIgnoreCase() {
		
		List<Course> expected = courseRepository.findByInstructorNameContainingIgnoreCase("Ish");
		List<Course> actual = new ArrayList<>();
		Course course5 = courseRepository.findById(3).get();
		actual.add(course5);
		System.out.println(expected);
		System.out.println(actual);
		Assertions.assertEquals(expected, actual);
	}

}
