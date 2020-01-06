package org.teamshare.itschool.services.impl;

import org.teamshare.itschool.dao.CourseDAO;
import org.teamshare.itschool.dao.hibernate.qualifiers.HibernateCourseManagerQualifier;
import org.teamshare.itschool.services.CourseService;
import org.teamshare.itschool.services.qualifiers.CourseServiceQualifier;
import org.teamshare.itschool.servlets.dto.CourseDTO;
import org.teamshare.itschool.servlets.dto.CourseDurationDTO;
import org.teamshare.itschool.servlets.dto.FeedbackDTO;
import org.teamshare.itschool.servlets.dto.TeacherDTO;
import org.teamshare.itschool.utils.ConverterUtils;

import javax.inject.Inject;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@CourseServiceQualifier
public class CourseServiceImpl implements CourseService {
    @Inject
    @HibernateCourseManagerQualifier
    private CourseDAO courseDAO;

    @Override
    public Long addCourse(CourseDTO course) {
        return courseDAO.addCourse(ConverterUtils.courseConverter.convertFrom(course));
    }

    @Override
    public Long addCourseDuration(CourseDurationDTO courseDuration) {
        return courseDAO.addCourseDuration(ConverterUtils.courseDurationConverter.convertFrom(courseDuration));
    }

    @Override
    public Long addTeacher(TeacherDTO teacher) {
        return courseDAO.addTeacher(ConverterUtils.teacherConverter.convertFrom(teacher));
    }

    @Override
    public CourseDTO getCoursesById(Long id) {
        return ConverterUtils.courseConverter.convertTo(courseDAO.getCoursesById(id));
    }

    @Override
    public List<CourseDurationDTO> getCourseDurationsForCourse(Long courseId) {
        return courseDAO.getCourseDurationsForCourse(courseId).stream()
                .map(ConverterUtils.courseDurationConverter::convertTo)
                .collect(Collectors.toList());
    }

    @Override
    public List<CourseDurationDTO> getCourseDurationsInPeriod(Date start, Date end) {
        return courseDAO.getCourseDurationsInPeriod(start, end).stream()
                .map(ConverterUtils.courseDurationConverter::convertTo)
                .collect(Collectors.toList());
    }

    @Override
    public List<CourseDurationDTO> getCourseDurationsForStudent(Long studentId) {
        return courseDAO.getCourseDurationsForStudent(studentId).stream()
                .map(ConverterUtils.courseDurationConverter::convertTo)
                .collect(Collectors.toList());
    }

    @Override
    public List<FeedbackDTO> getFeedbacksForCourse(Long courseId) {
        return courseDAO.getFeedbacksForCourse(courseId).stream()
                .map(ConverterUtils.feedbackConverter::convertTo)
                .collect(Collectors.toList());
    }

    @Override
    public List<TeacherDTO> getTeachersForCourse(Long courseId) {
        return courseDAO.getTeachersForCourse(courseId).stream()
                .map(ConverterUtils.teacherConverter::convertTo)
                .collect(Collectors.toList());
    }
}
