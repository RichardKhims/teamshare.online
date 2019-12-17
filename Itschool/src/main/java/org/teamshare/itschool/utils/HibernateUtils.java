package org.teamshare.itschool.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import javax.persistence.criteria.CriteriaBuilder;
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
}
