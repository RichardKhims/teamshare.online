package org.teamshare.itschool.dao.hibernate;

import org.teamshare.itschool.dao.StudentsDAO;
import org.teamshare.itschool.dao.entity.Student;
import org.teamshare.itschool.dao.hibernate.qualifiers.HibernateStudentManagerQualifier;
import org.teamshare.itschool.utils.HibernateUtils;

import java.util.List;

@HibernateStudentManagerQualifier
public class StudentDBManager implements StudentsDAO {
    @Override
    public List<Student> getStudentsForCourseDuration(List<Long> courseDurationIds) {
        return null;
    }

    @Override
    public List<Student> getStudentsForCourse(Long courseId) {
        return null;
    }

    @Override
    public Student getStudentById(Long id) {
        return HibernateUtils.getEntitiesById(id, Student.class);
    }

    @Override
    public Long addStudentForCourseDuration(Student student) {
        return HibernateUtils.addEntity(student);
    }
}
