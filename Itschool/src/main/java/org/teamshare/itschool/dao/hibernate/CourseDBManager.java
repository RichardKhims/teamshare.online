package org.teamshare.itschool.dao.hibernate;

import org.hibernate.query.Query;
import org.teamshare.itschool.dao.CourseDAO;
import org.teamshare.itschool.dao.constants.CourseColumns;
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
        return (Long) HibernateUtils.getCurrentSession().save(course);
    }

    @Override
    @Transactional
    public Long addCourseDuration(CourseDuration courseDuration) {
        return (Long) HibernateUtils.getCurrentSession().save(courseDuration);
    }

    @Override
    @Transactional
    public Course getCoursesById(Long id) {
        return HibernateUtils.getCurrentSession().get(Course.class, id);
    }

    @Override
    public List<CourseDuration> getCourseDurationsForCourse(Course course) {
        return null;
    }

    @Override
    public List<CourseDuration> getCourseDurationsInPeriod(Date start, Date end) {
        return null;
    }

    @Override
    public List<CourseDuration> getCourseDurationsForStudent(Student student) {
        return null;
    }

    @Override
    public List<Feedback> getFeedbacksForCourse(Course course) {
        return null;
    }

    @Override
    public List<Teacher> getTeachersForCourse(Course course) {
        return null;
    }

    /*
    public List<Course> getCoursesByType(String type) {
        CriteriaBuilder criteriaBuilder = HibernateUtils.createCriteriaBuilder();
        CriteriaQuery<Course> criteriaQuery = criteriaBuilder.createQuery(Course.class);
        Root<Course> root = criteriaQuery.from(Course.class);

        criteriaQuery.select(root).where(criteriaBuilder.equal(root.get(CourseColumns.TYPE_COLUMN), type));

        Query<Course> query = HibernateUtils.getCurrentSession().createQuery(criteriaQuery);
        return query.getResultList();
    }
    */
}
