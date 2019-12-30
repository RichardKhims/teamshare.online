package org.teamshare.itschool.dao;

import org.teamshare.itschool.dao.entity.Course;
import org.teamshare.itschool.dao.entity.CourseDuration;
import org.teamshare.itschool.dao.entity.Student;

import java.util.List;

/**
 * Интерфейс работы с базой студентов
 */
public interface StudentsDAO {
    /**
     * Получить список студентов, проходивыших обучение по заданному списку мероприятий
     * @param courseDurations
     * @return
     */
    List<Student> getStudentsForCourseDuration(List<CourseDuration> courseDurations);

    /**
     * Получить список всех студентов по данной дисциплине
     * @param course
     * @return
     */
    List<Student> getStudentsForCourse(Course course);

    /**
     * Получить студента по id
     * @param id
     * @return
     */
    Student getStudentById(Long id);

    /**
     * Зарегистрировать студента на прохождения обучения
     * @param student
     * @param courseDuration
     * @return
     */
    Long addStudentForCourseDuration(Student student, CourseDuration courseDuration);
}
