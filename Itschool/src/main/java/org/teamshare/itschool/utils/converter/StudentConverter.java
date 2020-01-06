package org.teamshare.itschool.utils.converter;

import org.teamshare.itschool.dao.entity.Student;
import org.teamshare.itschool.servlets.dto.StudentDTO;

public class StudentConverter implements BiConverter<Student, StudentDTO> {
    @Override
    public StudentDTO convertTo(Student student) {
        return null;
    }

    @Override
    public Student convertFrom(StudentDTO studentDTO) {
        return null;
    }
}
