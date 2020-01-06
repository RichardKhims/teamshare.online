package org.teamshare.itschool.services.impl;

import org.teamshare.itschool.dao.StudentsDAO;
import org.teamshare.itschool.dao.hibernate.qualifiers.HibernateStudentManagerQualifier;
import org.teamshare.itschool.services.StudentService;
import org.teamshare.itschool.servlets.dto.StudentDTO;
import org.teamshare.itschool.utils.ConverterUtils;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

public class StudentServiceImpl implements StudentService {
    @Inject
    @HibernateStudentManagerQualifier
    private StudentsDAO studentsDAO;

    @Override
    public List<StudentDTO> getStudentsForCourseDuration(List<Long> courseDurationIds) {
        return studentsDAO.getStudentsForCourseDuration(courseDurationIds).stream()
                .map(ConverterUtils.studentConverter::convertTo)
                .collect(Collectors.toList());
    }

    @Override
    public List<StudentDTO> getStudentsForCourse(Long courseId) {
        return studentsDAO.getStudentsForCourse(courseId).stream()
                .map(ConverterUtils.studentConverter::convertTo)
                .collect(Collectors.toList());
    }

    @Override
    public StudentDTO getStudentById(Long id) {
        return ConverterUtils.studentConverter.convertTo(studentsDAO.getStudentById(id));
    }

    @Override
    public Long addStudentForCourseDuration(StudentDTO student) {
        return studentsDAO.addStudentForCourseDuration(ConverterUtils.studentConverter.convertFrom(student));
    }
}
