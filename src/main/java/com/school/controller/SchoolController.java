package com.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.school.entity.CourseMaterial;
import com.school.service.CourseMaterialService;

@RestController
public class SchoolController {
	
		
	@Autowired
	private CourseMaterialService courseMaterialService;
	
	
	@GetMapping("/welcome")
	public String welcomeMessage() {
		
		return "<H1> Welcome to School Database Management System!!! </H1>";
		
	}
	
	
	@PostMapping("SchoolAPI/coursematerial")
	public CourseMaterial saveCoursematerial(@RequestBody CourseMaterial courseMaterial) {
		
		return courseMaterialService.saveCourseMaterial(courseMaterial);
		
		
		
		
	}

}
