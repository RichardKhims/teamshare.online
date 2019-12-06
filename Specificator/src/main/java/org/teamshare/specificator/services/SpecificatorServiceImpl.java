package org.teamshare.specificator.services;

import org.teamshare.specificator.dao.SpecificatorDAO;
import org.teamshare.specificator.dao.hibernate.HibernateSpecificatorManagerQualifier;

import javax.inject.Inject;

@SpecificatorServiceQualifier
public class SpecificatorServiceImpl implements SpecificatorService {
    @Inject
    @HibernateSpecificatorManagerQualifier
    private SpecificatorDAO specificatorDAO;
}
