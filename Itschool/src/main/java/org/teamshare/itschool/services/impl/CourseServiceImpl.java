package org.teamshare.itschool.services.impl;

import org.teamshare.itschool.dao.CourseDAO;
import org.teamshare.itschool.dao.hibernate.qualifiers.HibernateCourseManagerQualifier;
import org.teamshare.itschool.services.CourseService;
import org.teamshare.itschool.services.qualifiers.CourseServiceQualifier;
import org.teamshare.itschool.servlets.dto.CourseDTO;
import org.teamshare.itschool.servlets.dto.CourseDurationDTO;
import org.teamshare.itschool.servlets.dto.FeedbackDTO;
import org.teamshare.itschool.servlets.dto.TeacherDTO;

import javax.inject.Inject;
import java.util.Date;
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
    public Long addCourseDuration(CourseDurationDTO courseDuration) {
        return null;
    }

    @Override
    public Long addTeacher(TeacherDTO teacher) {
        return null;
    }

    @Override
    public CourseDTO getCoursesById(Long id) {
        return null;
    }

    @Override
    public List<CourseDurationDTO> getCourseDurationsForCourse(Long courseId) {
        return null;
    }

    @Override
    public List<CourseDurationDTO> getCourseDurationsInPeriod(Date start, Date end) {
        return null;
    }

    @Override
    public List<CourseDurationDTO> getCourseDurationsForStudent(Long studentId) {
        return null;
    }

    @Override
    public List<FeedbackDTO> getFeedbacksForCourse(Long courseId) {
        return null;
    }

    @Override
    public List<TeacherDTO> getTeachersForCourse(Long courseId) {
        return null;
    }
}
