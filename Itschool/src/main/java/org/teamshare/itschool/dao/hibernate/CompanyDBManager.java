package org.teamshare.itschool.dao.hibernate;

import org.teamshare.itschool.dao.CompanyDAO;
import org.teamshare.itschool.dao.constants.CompanyColumns;
import org.teamshare.itschool.dao.constants.HRManagerColumns;
import org.teamshare.itschool.dao.constants.TeacherColumns;
import org.teamshare.itschool.dao.entity.Company;
import org.teamshare.itschool.dao.entity.HRManager;
import org.teamshare.itschool.dao.entity.Teacher;
import org.teamshare.itschool.dao.hibernate.qualifiers.HibernateCompanyManagerQualifier;
import org.teamshare.itschool.utils.HibernateUtils;

import javax.transaction.Transactional;
import java.util.List;

@HibernateCompanyManagerQualifier
public class CompanyDBManager implements CompanyDAO {
    @Override
    @Transactional
    public Company getCompanyById(Long id) {
        return HibernateUtils.getEntitiesById(id, Company.class);
    }

    @Override
    public Company getCompanyByName(String name) {
        return HibernateUtils.makeQueryForParam(CompanyColumns.NAME_COLUMN, name, Company.class).getSingleResult();
    }

    @Override
    public List<HRManager> getHRManagersForCompany(Long companyId) {
        return HibernateUtils.makeQueryForParam(HRManagerColumns.COMPANY_ID_COLUMN, companyId, HRManager.class).getResultList();
    }

    @Override
    public List<Teacher> getTeachersForCompany(Long companyId) {
        return HibernateUtils.makeQueryForParam(TeacherColumns.COMPANY_ID_COLUMN, companyId, Teacher.class).getResultList();
    }
}
