package com.sqli.spring;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sqli.spring.beans.Student;
import com.sqli.spring.service.AdminStudentService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private AdminStudentService service;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home( Model model) {
        model.addAttribute("students", service.listStudent());
        model.addAttribute("isEmpty",service.listStudent().isEmpty());
        model.addAttribute("student",new Student());
		return "home";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("student") Student student, Model model) {
		service.addStudent(student);
        model.addAttribute("students", service.listStudent());
		return "home";
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteStudent(@PathVariable("id") String cne,Model model) {
		service.deleteStudent(cne);
		model.addAttribute("student", new Student());
        model.addAttribute("students", service.listStudent());
		return "home";
	}
	
	@RequestMapping("/edit/{id}")
	public String editStudent(@PathVariable("id") String cne,Model model) {
		model.addAttribute("student", service.getStudentById(cne));
        model.addAttribute("students", service.listStudent());
		return "home";
	}
	
	
	

}
