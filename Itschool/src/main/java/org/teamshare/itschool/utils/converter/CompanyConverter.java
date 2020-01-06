package org.teamshare.itschool.utils.converter;

import org.teamshare.itschool.dao.entity.Company;
import org.teamshare.itschool.servlets.dto.CompanyDTO;

public class CompanyConverter implements BiConverter<Company, CompanyDTO> {
    @Override
    public CompanyDTO convertTo(Company company) {
        return null;
    }

    @Override
    public Company convertFrom(CompanyDTO companyDTO) {
        return null;
    }
}
