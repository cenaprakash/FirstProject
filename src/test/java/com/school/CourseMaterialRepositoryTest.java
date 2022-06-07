package com.school;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.school.entity.Course;
import com.school.entity.CourseMaterial;
import com.school.repository.CourseMaterialRepository;

@SpringBootTest
public class CourseMaterialRepositoryTest {
	
	@Autowired
	private CourseMaterialRepository courseMaterialRepository;
	
	
	@Test
	public void saveCourseMaterial() {
		Course course = Course.builder()
				.credit(5)
				.title("Information Technology").build();
		
		CourseMaterial coursematerial = CourseMaterial.builder()
				.course(course)
				.url("Http://Amazon.com").build();
		courseMaterialRepository.save(coursematerial);
		
	}

}
