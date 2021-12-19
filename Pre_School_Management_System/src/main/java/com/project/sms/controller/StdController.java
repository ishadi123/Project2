package com.project.sms.controller;



import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.project.sms.entity.Student;
import com.project.sms.service.stdService;

@Controller
public class StdController {
	@Autowired
	private stdService service;
	
	@GetMapping("/")
	public String home(Model m) {
		
		List<Student> std = service.getAllStudent();
		m.addAttribute("std",std);
		
		return "index";
		
	}

	@GetMapping("/addStudent")
	public String addStudentForm() {
		return "addStudent";
		
	}
	
	@PostMapping("/register")
	public String studentRegister(@ModelAttribute Student s,HttpSession session) {
		
		System.out.println(s);
		service.add_Student(s);
		session.setAttribute("msg", "Student added successfully....");
		return "redirect:/";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id, Model m) {
		Student s = service.getStdById(id);
		m.addAttribute("std", s);
		return "edit";
	}
	
	@PostMapping("/update")
	public String updateStd(@ModelAttribute Student s, HttpSession session) {
		service.add_Student(s);
		session.setAttribute("msg", "Student details update successfully....");
		return "redirect:/";	
		
	}
	
	@GetMapping("/delete/{id}")
	public String deleteStd(@PathVariable int id, HttpSession session) {
		
		service.deleteStd(id);
		session.setAttribute("msg", "Student details delete successfully....");
		return "redirect:/";
		
	}
	
	
		
	
}
