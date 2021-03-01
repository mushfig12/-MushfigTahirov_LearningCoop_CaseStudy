package org.mushfigtahirov.learningcoop.controllers;

import javax.validation.Valid;

import org.mushfigtahirov.learningcoop.models.User;
import org.mushfigtahirov.learningcoop.repositories.UserRepository;
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
public class HomeController {
	
	private UserRepository userRepository;
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	public HomeController(UserRepository userRepository, PasswordEncoder passwordEncoder) {
		super();
		this.userRepository = userRepository;
		this.passwordEncoder= passwordEncoder;
	}
	
	// This method opens about page
	// Also, this method utilizes session management
	@GetMapping("/")
	public String showAboutPage(Model model, Authentication authentication) {
		model.addAttribute("currentPrincipal", authentication.getName());
		return "about";
	}
	
	// This method opens login page
	@GetMapping("/login")
	public String showLoginPage() {
		return "login";
	}

	// This method opens access_denied page
	@GetMapping("/access_denied")
	public String showAccessDeniedPage() {
		return "access_denied";
	}
	
	// This method opens logout page
	@GetMapping("/logoutSuccess")
	public String showLogoutPage() {
		return "logout";
	}
	
	// This method opens sign_up page
	@GetMapping("/register")
	public String showRegistrationPage(Model model ) {
		model.addAttribute("user", new User());
		
		return "sign_up";
	}
	
	// This method signs up new user
	@PostMapping("/register")
	public String registerNewUser(@Valid @ModelAttribute("user") User user, BindingResult result ) {
		if(result.hasErrors()) {
			return "sign_up";
		}
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		userRepository.save(user);
		
		return "redirect:/login"; 
	}
	
}
