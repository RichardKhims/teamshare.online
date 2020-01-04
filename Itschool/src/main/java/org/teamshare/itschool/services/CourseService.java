package org.teamshare.itschool.services;

import org.teamshare.itschool.servlets.dto.CourseDTO;
import org.teamshare.itschool.servlets.dto.CourseDurationDTO;
import org.teamshare.itschool.servlets.dto.FeedbackDTO;
import org.teamshare.itschool.servlets.dto.TeacherDTO;

import java.util.Date;
import java.util.List;

public interface CourseService {
    /**
     * Создать новую дисцпилину по курсу
     * @param course
     * @return возвращает идентификатор записи
     */
    Long addCourse(CourseDTO course);

    /**
     * Создать новое мероприятия курса обучения
     * @param courseDuration
     * @return возвращает идентификатор записи
     */
    Long addCourseDuration(CourseDurationDTO courseDuration);

    /**
     * Зарегистрировать нового учителя
     * @param teacher
     * @return
     */
    Long addTeacher(TeacherDTO teacher);

    /**
     * Получить информацию по курсу по id
     * @param id
     * @return
     */
    CourseDTO getCoursesById(Long id);

    /**
     * Получить все мероприятия по заданному курсу
     * @param courseId
     * @return
     */
    List<CourseDurationDTO> getCourseDurationsForCourse(Long courseId);

    /**
     * Получить список мероприятий за период
     * @param start
     * @param end
     * @return
     */
    List<CourseDurationDTO> getCourseDurationsInPeriod(Date start, Date end);

    /**
     * Получить список всех мероприятий, на которых присутсвовал студент
     * @param studentId
     * @return
     */
    List<CourseDurationDTO> getCourseDurationsForStudent(Long studentId);

    /**
     * Получить отзывы по курсу
     * @param courseId
     * @return
     */
    List<FeedbackDTO> getFeedbacksForCourse(Long courseId);

    /**
     * Получить список учителей по курсу
     * @param courseId
     * @return
     */
    List<TeacherDTO> getTeachersForCourse(Long courseId);
}
