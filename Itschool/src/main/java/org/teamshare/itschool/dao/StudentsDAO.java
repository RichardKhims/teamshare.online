package org.teamshare.itschool.dao;

import org.teamshare.itschool.dao.entity.Student;

import java.util.List;

/**
 * Интерфейс работы с базой студентов
 */
public interface StudentsDAO {
    /**
     * Получить список студентов, проходивыших обучение по заданному списку мероприятий
     * @param courseDurationIds
     * @return
     */
    List<Student> getStudentsForCourseDuration(List<Long> courseDurationIds);

    /**
     * Получить список всех студентов по данной дисциплине
     * @param courseId
     * @return
     */
    List<Student> getStudentsForCourse(Long courseId);

    /**
     * Получить студента по id
     * @param id
     * @return
     */
    Student getStudentById(Long id);

    /**
     * Зарегистрировать студента на прохождения обучения
     * @param student
     * @return
     */
    Long addStudentForCourseDuration(Student student);
}
