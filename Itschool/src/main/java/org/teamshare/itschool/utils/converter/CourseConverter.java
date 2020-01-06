package org.teamshare.itschool.utils.converter;

import org.teamshare.itschool.dao.entity.Course;
import org.teamshare.itschool.servlets.dto.CourseDTO;

public class CourseConverter implements BiConverter<Course, CourseDTO> {
    @Override
    public CourseDTO convertTo(Course course) {
        return null;
    }

    @Override
    public Course convertFrom(CourseDTO courseDTO) {
        return null;
    }
}
