package com.school.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
public class CourseMaterial {

	@Id
	@SequenceGenerator(name ="CourseMaterial_Sequence", sequenceName = "CourseMaterial_Sequence",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="CourseMaterial_Sequence" )
	private Long courseMaterialId;
	
	@Column(name="CourseMaterial_url")
	private String url;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "course_id",
	referencedColumnName = "courseId")
	private Course course; 
	
}
