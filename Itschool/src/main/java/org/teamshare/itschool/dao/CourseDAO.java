package org.teamshare.itschool.dao;

import org.teamshare.itschool.dao.entity.*;

import java.util.Date;
import java.util.List;

/**
 * Интерфейс работы с базой курсов обучения
 */
public interface CourseDAO {
    /**
     * Создать новую дисцпилину по курсу
     * @param course
     * @return возвращает идентификатор записи
     */
    Long addCourse(Course course);

    /**
     * Создать новое мероприятия курса обучения
     * @param courseDuration
     * @return возвращает идентификатор записи
     */
    Long addCourseDuration(CourseDuration courseDuration);

    /**
     * Зарегистрировать нового учителя
     * @param teacher
     * @return
     */
    Long addTeacher(Teacher teacher);

    /**
     * Получить список всех дисциплин
     * @return
     */
    List<Course> getCourses();

    /**
     * Получить информацию по курсу по id
     * @param id
     * @return
     */
    Course getCoursesById(Long id);

    /**
     * Получить все мероприятия по заданному курсу
     * @param courseId
     * @return
     */
    List<CourseDuration> getCourseDurationsForCourse(Long courseId);

    /**
     * Получить список мероприятий за период
     * @param start
     * @param end
     * @return
     */
    List<CourseDuration> getCourseDurationsInPeriod(Date start, Date end);

    /**
     * Получить список всех мероприятий, на которых присутсвовал студент
     * @param studentId
     * @return
     */
    List<CourseDuration> getCourseDurationsForStudent(Long studentId);

    /**
     * Получить отзывы по курсу
     * @param courseId
     * @return
     */
    List<Feedback> getFeedbacksForCourse(Long courseId);

    /**
     * Получить список учителей по курсу
     * @param courseId
     * @return
     */
    List<Teacher> getTeachersForCourse(Long courseId);
}
