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
     * Получить информацию по курсу по id
     * @param id
     * @return
     */
    Course getCoursesById(Long id);

    /**
     * Получить все мероприятия по заданному курсу
     * @param course
     * @return
     */
    List<CourseDuration> getCourseDurationsForCourse(Course course);

    /**
     * Получить список мероприятий за период
     * @param start
     * @param end
     * @return
     */
    List<CourseDuration> getCourseDurationsInPeriod(Date start, Date end);

    /**
     * Получить список всех мероприятий, на которых присутсвовал студент
     * @param student
     * @return
     */
    List<CourseDuration> getCourseDurationsForStudent(Student student);

    /**
     * Получить отзывы по курсу
     * @param course
     * @return
     */
    List<Feedback> getFeedbacksForCourse(Course course);

    /**
     * Получить список учителей по курсу
     * @param course
     * @return
     */
    List<Teacher> getTeachersForCourse(Course course);
}
