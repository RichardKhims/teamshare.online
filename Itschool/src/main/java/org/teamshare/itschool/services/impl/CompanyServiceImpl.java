package org.teamshare.itschool.services.impl;

import org.teamshare.itschool.dao.CompanyDAO;
import org.teamshare.itschool.dao.hibernate.qualifiers.HibernateCompanyManagerQualifier;
import org.teamshare.itschool.services.CompanyService;
import org.teamshare.itschool.services.qualifiers.CompanyServiceQualifier;
import org.teamshare.itschool.servlets.dto.CompanyDTO;
import org.teamshare.itschool.servlets.dto.HRManagerDTO;
import org.teamshare.itschool.servlets.dto.TeacherDTO;
import org.teamshare.itschool.utils.ConverterUtils;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@CompanyServiceQualifier
public class CompanyServiceImpl implements CompanyService {
    @Inject
    @HibernateCompanyManagerQualifier
    private CompanyDAO companyDAO;

    @Override
    public CompanyDTO getCompanyById(Long id) {
        return ConverterUtils.companyConverter.convertTo(companyDAO.getCompanyById(id));
    }

    @Override
    public CompanyDTO getCompanyByName(String name) {
        return ConverterUtils.companyConverter.convertTo(companyDAO.getCompanyByName(name));
    }

    @Override
    public List<HRManagerDTO> getHRManagersForCompany(Long companyId) {
        return companyDAO.getHRManagersForCompany(companyId).stream()
                .map(ConverterUtils.hrManagerConverter::convertTo)
                .collect(Collectors.toList());
    }

    @Override
    public List<TeacherDTO> getTeachersForCompany(Long companyId) {
        return companyDAO.getTeachersForCompany(companyId).stream()
                .map(ConverterUtils.teacherConverter::convertTo)
                .collect(Collectors.toList());
    }
}
