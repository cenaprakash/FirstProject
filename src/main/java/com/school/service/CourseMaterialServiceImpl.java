package com.school.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.entity.Course;
import com.school.entity.CourseMaterial;
import com.school.repository.CourseMaterialRepository;

@Service
public class CourseMaterialServiceImpl implements CourseMaterialService{
	
	@Autowired
	private CourseMaterialRepository courseMaterialRepository;

	@Override
	public CourseMaterial saveCourseMaterial(CourseMaterial courseMaterial) {

		Course course = courseMaterial.getCourse();
		course.setCredit(course.getCredit());
		course.setTitle(course.getTitle());
		CourseMaterial SavedCourseMaterial = courseMaterialRepository.save(courseMaterial);		
		return SavedCourseMaterial;

	}

}
