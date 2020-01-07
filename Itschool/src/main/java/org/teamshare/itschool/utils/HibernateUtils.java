package org.teamshare.itschool.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;
import org.teamshare.itschool.dao.constants.FeedbackColumns;
import org.teamshare.itschool.dao.entity.Feedback;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

public class HibernateUtils {
    private static SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        Configuration configObj = new Configuration();
        configObj.configure("hibernate.cfg.xml");

        ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().applySettings(configObj.getProperties()).build();

        return configObj.buildSessionFactory(serviceRegistryObj);
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Transactional
    public static Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    public static CriteriaBuilder createCriteriaBuilder() {
        return getCurrentSession().getCriteriaBuilder();
    }

    @Transactional
    public static <T> Long addEntity(T entity) {
        return (Long) HibernateUtils.getCurrentSession().save(entity);
    }

    @Transactional
    public static <T> T getEntitiesById(Long id, Class<T> clazz) {
        return HibernateUtils.getCurrentSession().get(clazz, id);
    }

    @Transactional
    public static <T> Query<T> makeQueryForParam(String paramName, Object paramValue, Class<T> clazz) {
        CriteriaBuilder cb = HibernateUtils.createCriteriaBuilder();
        CriteriaQuery<T> query = cb.createQuery(clazz);
        Root<T> root = query.from(clazz);

        query.select(root).where(cb.equal(root.get(paramName), paramValue));

        return HibernateUtils.getCurrentSession().createQuery(query);
    }

    @Transactional
    public static <T> Query<T> makeQueryForObject(Class<T> clazz) {
        CriteriaBuilder cb = HibernateUtils.createCriteriaBuilder();
        CriteriaQuery<T> query = cb.createQuery(clazz);
        Root<T> root = query.from(clazz);

        query.select(root);

        return HibernateUtils.getCurrentSession().createQuery(query);
    }
}
