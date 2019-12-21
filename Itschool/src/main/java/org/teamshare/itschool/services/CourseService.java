package org.teamshare.itschool.services;

import org.teamshare.itschool.servlets.dto.CourseDTO;

import java.util.List;

public interface CourseService {
    Long addCourse(CourseDTO course);
    CourseDTO getCoursesById(Long id);
    List<CourseDTO> getCoursesByType(String type);
}
