package org.teamshare.itschool.utils;

import org.teamshare.itschool.dao.entity.*;
import org.teamshare.itschool.servlets.dto.*;
import org.teamshare.itschool.utils.converter.*;

public class ConverterUtils {
    public static final BiConverter<Company, CompanyDTO> companyConverter = new CompanyConverter();
    public static final BiConverter<Course, CourseDTO> courseConverter = new CourseConverter();
    public static final BiConverter<CourseDuration, CourseDurationDTO> courseDurationConverter = new CourseDurationConverter();
    public static final BiConverter<Feedback, FeedbackDTO> feedbackConverter = new FeedbackConverter();
    public static final BiConverter<HRManager, HRManagerDTO> hrManagerConverter = new HRManagerConverter();
    public static final BiConverter<Student, StudentDTO> studentConverter = new StudentConverter();
    public static final BiConverter<Teacher, TeacherDTO> teacherConverter = new TeacherConverter();
}
