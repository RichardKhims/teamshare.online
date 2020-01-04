package org.teamshare.itschool.services;

import org.teamshare.itschool.servlets.dto.CompanyDTO;
import org.teamshare.itschool.servlets.dto.HRManagerDTO;
import org.teamshare.itschool.servlets.dto.TeacherDTO;

import java.util.List;

public interface CompanyService {
    /**
     * Получить компанию по id
     * @param id
     * @return
     */
    CompanyDTO getCompanyById(Long id);

    /**
     * Получить компанию по имени
     * @param name
     * @return
     */
    CompanyDTO getCompanyByName(String name);

    /**
     * Получить список HR-менеджеров компании
     * @param companyId
     * @return
     */
    List<HRManagerDTO> getHRManagersForCompany(Long companyId);

    /**
     * Получить всех преподователей данной компании
     * @param companyId
     * @return
     */
    List<TeacherDTO> getTeachersForCompany(Long companyId);
}
