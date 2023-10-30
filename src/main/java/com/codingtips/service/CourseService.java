package com.codingtips.service;

import java.util.List;

import com.codingtips.binding.Course;

public interface CourseService {
	public String upsert(Course course); //is a polymorphic method for update and insertion
	
	public Course getById(Integer cid);
	
	public List<Course> getAllCourses();
	
	public String deleteById(Integer cid);

}
