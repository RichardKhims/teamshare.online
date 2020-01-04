package org.teamshare.itschool.services;

import org.teamshare.itschool.servlets.dto.StudentDTO;

import java.util.List;

public interface StudentService {
    /**
     * Получить список студентов, проходивыших обучение по заданному списку мероприятий
     * @param courseDurationIds
     * @return
     */
    List<StudentDTO> getStudentsForCourseDuration(List<Long> courseDurationIds);

    /**
     * Получить список всех студентов по данной дисциплине
     * @param courseId
     * @return
     */
    List<StudentDTO> getStudentsForCourse(Long courseId);

    /**
     * Получить студента по id
     * @param id
     * @return
     */
    StudentDTO getStudentById(Long id);

    /**
     * Зарегистрировать студента на прохождения обучения
     * @param student
     * @return
     */
    Long addStudentForCourseDuration(StudentDTO student);
}
