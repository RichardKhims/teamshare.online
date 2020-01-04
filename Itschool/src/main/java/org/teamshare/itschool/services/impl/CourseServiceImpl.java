package org.teamshare.itschool.services.impl;

import org.teamshare.itschool.dao.CourseDAO;
import org.teamshare.itschool.dao.hibernate.qualifiers.HibernateCourseManagerQualifier;
import org.teamshare.itschool.services.CourseService;
import org.teamshare.itschool.services.qualifiers.CourseServiceQualifier;
import org.teamshare.itschool.servlets.dto.CourseDTO;

import javax.inject.Inject;
import java.util.List;

@CourseServiceQualifier
public class CourseServiceImpl implements CourseService {
    @Inject
    @HibernateCourseManagerQualifier
    private CourseDAO courseDAO;


    @Override
    public Long addCourse(CourseDTO course) {
        return null;
    }

    @Override
    public CourseDTO getCoursesById(Long id) {
        return null;
    }

    @Override
    public List<CourseDTO> getCoursesByType(String type) {
        return null;
    }
}
