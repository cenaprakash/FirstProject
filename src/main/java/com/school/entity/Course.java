package com.school.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Course{
	
	@Id
	@SequenceGenerator(name ="Course_Sequence", sequenceName = "Course_Sequence",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="Course_Sequence" )	
	
	private Long courseId;
	
	@Column(name="course_title")
	private String title;
	
	@Column(name="course_credit")
	private Integer credit;
	
	

}
