package org.mushfigtahirov.learningcoop.controllers;
import javax.validation.Valid;

import org.mushfigtahirov.learningcoop.models.Course;
import org.mushfigtahirov.learningcoop.models.Student;
import org.mushfigtahirov.learningcoop.repositories.CourseRepository;
import org.mushfigtahirov.learningcoop.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class StudentController {
	
	private StudentRepository studentRepository;
	private CourseRepository courseRepository;
	

	
	@Autowired
	public StudentController(StudentRepository studentRepository, PasswordEncoder passwordEncoder, CourseRepository courseRepository) {
		super();
		this.studentRepository = studentRepository;
		this.courseRepository= courseRepository;
	}
	// This method opens student page
	@GetMapping("/StudentRegistration")
	public String showRegistrationPage(Model model, Authentication authentication) {
		model.addAttribute("student", new Student());
		model.addAttribute("currentPrincipal", authentication.getName());
		return "student";
	}
	// This method saves student registration form
	@PostMapping("/StudentRegistration")
	public String registerNewStudent(@Valid @ModelAttribute("student") Student student, BindingResult result) {
		if(result.hasErrors()) {
			return "student";
		}
			studentRepository.save(student);
		return "redirect:/about"; 
	}
	
	// This method shows all courses in about (welcome)  page
	@GetMapping("/about")
	public String showCourseList(Model model, Authentication authentication) {

		Iterable<Course> allCourses = courseRepository.findAll();
	
	
		model.addAttribute("allCourses", allCourses);
		model.addAttribute("currentPrincipal", authentication.getName());
		return "about";
	}

}
