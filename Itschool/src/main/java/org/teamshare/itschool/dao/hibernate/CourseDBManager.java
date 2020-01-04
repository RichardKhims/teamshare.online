package org.teamshare.itschool.dao.hibernate;

import org.hibernate.query.Query;
import org.teamshare.itschool.dao.CourseDAO;
import org.teamshare.itschool.dao.constants.CourseDurationColumns;
import org.teamshare.itschool.dao.constants.FeedbackColumns;
import org.teamshare.itschool.dao.entity.*;
import org.teamshare.itschool.dao.hibernate.qualifiers.HibernateCourseManagerQualifier;
import org.teamshare.itschool.utils.HibernateUtils;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@HibernateCourseManagerQualifier
public class CourseDBManager implements CourseDAO {
    @Override
    @Transactional
    public Long addCourse(Course course) {
        return HibernateUtils.addEntity(course);
    }

    @Override
    @Transactional
    public Long addCourseDuration(CourseDuration courseDuration) {
        return HibernateUtils.addEntity(courseDuration);
    }

    @Override
    @Transactional
    public Long addTeacher(Teacher teacher) {
        return HibernateUtils.addEntity(teacher);
    }

    @Override
    @Transactional
    public Course getCoursesById(Long id) {
        return HibernateUtils.getEntitiesById(id, Course.class);
    }

    @Override
    @Transactional
    public List<CourseDuration> getCourseDurationsForCourse(Long courseId) {
        return null;
    }

    @Override
    @Transactional
    public List<CourseDuration> getCourseDurationsInPeriod(Date start, Date end) {
        CriteriaBuilder cb = HibernateUtils.createCriteriaBuilder();
        CriteriaQuery<CourseDuration> query = cb.createQuery(CourseDuration.class);
        Root<CourseDuration> root = query.from(CourseDuration.class);

        query.select(root).where(cb.between(root.get(CourseDurationColumns.START_COLUMN), start, end));

        Query<CourseDuration> res = HibernateUtils.getCurrentSession().createQuery(query);
        return res.getResultList();
    }

    @Override
    @Transactional
    public List<CourseDuration> getCourseDurationsForStudent(Long studentId) {
        return null;
    }

    @Override
    @Transactional
    public List<Feedback> getFeedbacksForCourse(Long courseId) {
        return HibernateUtils.makeQueryForParam(FeedbackColumns.COURSE_ID_COLUMN, courseId, Feedback.class).getResultList();
    }

    @Override
    @Transactional
    public List<Teacher> getTeachersForCourse(Long courseId) {
        return null;
    }
}
