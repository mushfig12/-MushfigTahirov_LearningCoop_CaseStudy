package org.mushfigtahirov.learningcoop.controllers;

import javax.validation.Valid;

import org.mushfigtahirov.learningcoop.models.ContactUs;
import org.mushfigtahirov.learningcoop.repositories.ContactUsRepository;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class ContactUsController {
	private ContactUsRepository contactUsRepository;

	public ContactUsController(ContactUsRepository contactUsRepository) {
		super();
		this.contactUsRepository = contactUsRepository;
	}
	
	//This method opens contactus page
	@GetMapping("/contactus")
	public String showContactUsPage(Model model, Authentication authentication) {
		model.addAttribute("contactUs", new ContactUs());
		model.addAttribute("currentPrincipal", authentication.getName());
		return "contactus";
	}
	// This method saves information on contact us form and redirects to about page
	@PostMapping("/contactUs")
	public String createNewCourse(@Valid @ModelAttribute("contactUs") ContactUs contactUs, BindingResult result) {
		if(result.hasErrors()) {
			return "contactus";
		}
		contactUsRepository.save(contactUs);
		
		return "redirect:/about"; 
	}
}
