package org.mushfigtahirov.learningcoop.repositories;

import java.util.List;

import org.mushfigtahirov.learningcoop.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
// This class contains 4 custom queries based on method name
public interface CourseRepository extends JpaRepository<Course, Integer> {
	List<Course> findByCourseName(String courseName);
	List<Course> findByInstructorName(String instructorName);
	
	List<Course> findByCourseNameContainingIgnoreCase(String courseNameSubstring);
	List<Course> findByInstructorNameContainingIgnoreCase(String instructorNameSubstring);
	
	
}
