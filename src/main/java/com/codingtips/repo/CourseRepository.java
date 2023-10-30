package com.codingtips.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codingtips.binding.Course;

public interface CourseRepository extends JpaRepository<Course, Serializable> {
	
	

}
