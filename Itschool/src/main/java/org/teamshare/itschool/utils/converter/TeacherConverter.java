package org.teamshare.itschool.utils.converter;

import org.teamshare.itschool.dao.entity.Teacher;
import org.teamshare.itschool.servlets.dto.TeacherDTO;

public class TeacherConverter implements BiConverter<Teacher, TeacherDTO> {
    @Override
    public TeacherDTO convertTo(Teacher teacher) {
        return null;
    }

    @Override
    public Teacher convertFrom(TeacherDTO teacherDTO) {
        return null;
    }
}
