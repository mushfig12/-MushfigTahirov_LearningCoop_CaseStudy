package org.mushfigtahirov.learningcoop.controllers;
import java.util.List;

import javax.validation.Valid;

import org.mushfigtahirov.learningcoop.exceptions.IsLastCourse;
import org.mushfigtahirov.learningcoop.models.Course;
import org.mushfigtahirov.learningcoop.repositories.CourseRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CourseController {
	private CourseRepository courseRepository;

	public CourseController(CourseRepository courseRepository) {
		super();
		this.courseRepository = courseRepository;
	}
	//This method goes to admin page and shows all courses
	@GetMapping("/admin")
	public String showAdminPage(Model model) {
		if (!model.containsAttribute("course")) {
			model.addAttribute("course", new Course());
		}
		Iterable<Course> allCourses = courseRepository.findAll();
		model.addAttribute("allCourses", allCourses);
		return "admin";
	}
	// This method creates a new course in admin page
	@PostMapping("/createCourse")
	public String createNewCourse(@Valid @ModelAttribute("course") Course course, BindingResult result) {
		if(result.hasErrors()) {
			return "admin";
		}
		courseRepository.save(course);
		
		return "redirect:/admin"; 
	}
	// This method goes to editCourse page and populates form
	@GetMapping("/editCourse")
	public String editCourse(@RequestParam("id") Integer id, Model model) {
		
		Course course= courseRepository.findById(id).get();
		model.addAttribute("course", course);
		return "editcourse";
	}
	
	// This method edits course in editCourse page and directs to admin page
	@PostMapping("/editCourse")
	public String editCourse(@Valid @ModelAttribute("course") Course course, BindingResult result) {
		if (result.hasErrors()) {
			return "admin";
		}
		courseRepository.save(course);
		return "redirect:/admin";
	}
	
	// This method deletes a course 
	// In the body of this method I implement my custom exception.
	@GetMapping("/delete/{id}")
	public String deleteCourse(@PathVariable("id") Integer id) {
	
		courseRepository.deleteById(id);
		
		try {
			if(id ==1) {
				throw new IsLastCourse();
			}
		} catch (IsLastCourse e) {
			System.err.println(e.getMessage());
		}
	
		return "redirect:/admin";
	}
	
		// This method searches course based on title and returns the course
		@GetMapping("/searchByName")
		public String searchByTitle(@RequestParam("courseName") String courseName, Model model) {

			if (!model.containsAttribute("course")) {
				model.addAttribute("course", new Course());
			}

			List<Course> courseList = courseRepository.findByCourseName(courseName);

			model.addAttribute("allCourses", courseList);
			return "about";
		}

		// This method searches course based on instructor name and returns the course
		@GetMapping("/searchByInstructor")
		public String searchByAuthor(@RequestParam("instructorName") String instructorName, Model model) {

			if (!model.containsAttribute("course")) {
				model.addAttribute("course", new Course());
			}

			List<Course> courseList = courseRepository.findByInstructorName(instructorName);

			model.addAttribute("allCourses", courseList);
			return "about";
		}
		
		// This method searches course based on part of the course name and returns the course
		@GetMapping("/searchByNameContains")
		public String searchByTitleContains(@RequestParam("courseNameSubstring") String courseNameSubstring, Model model) {

			if (!model.containsAttribute("course")) {
				model.addAttribute("course", new Course());
			}

			List<Course> courseList = courseRepository.findByCourseNameContainingIgnoreCase(courseNameSubstring);

			model.addAttribute("allCourses", courseList);
			return "about";
		}
		
		// This method searches course based on part of the instructor name and returns the course
		@GetMapping("/searchByInstructorContains")
		public String searchByInstructorNameContains(@RequestParam("instructorNameSubstring") String instructorNameSubstring, Model model) {

			if (!model.containsAttribute("course")) {
				model.addAttribute("course", new Course());
			}

			List<Course> courseList = courseRepository.findByInstructorNameContainingIgnoreCase(instructorNameSubstring);

			model.addAttribute("allCourses", courseList);
			return "about";
		}
		

	
	
}
