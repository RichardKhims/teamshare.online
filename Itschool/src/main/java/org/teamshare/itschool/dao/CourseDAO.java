package org.teamshare.itschool.dao;

import org.teamshare.itschool.dao.entity.Course;

import java.util.Date;
import java.util.List;

public interface CourseDAO {
    Long addCourse(Course course);
    Course getCoursesById(Long id);
    List<Course> getCoursesByType(String type);
//    List<Course> getCoursesInPeriod(Date start, Date end);
}
