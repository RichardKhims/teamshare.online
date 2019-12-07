package org.teamshare.specificator.dao.hibernate;

import org.teamshare.specificator.dao.SpecificatorDAO;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@HibernateSpecificatorManagerQualifier
public class SpecificatorDBManager implements SpecificatorDAO {
    private final static EntityManagerFactory emf = Persistence.createEntityManagerFactory( "SpecificatorPersistence" );
}
