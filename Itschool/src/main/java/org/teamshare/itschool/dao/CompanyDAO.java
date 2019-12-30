package org.teamshare.itschool.dao;

import org.teamshare.itschool.dao.entity.Company;
import org.teamshare.itschool.dao.entity.HRManager;
import org.teamshare.itschool.dao.entity.Teacher;

import java.util.List;

/**
 * Интерфейс работы с базой компаний
 */
public interface CompanyDAO {
    /**
     * Получить компанию по id
     * @param id
     * @return
     */
    Company getCompanyById(Long id);

    /**
     * Получить компанию по имени
     * @param name
     * @return
     */
    Company getCompanyByName(String name);

    /**
     * Получить список HR-менеджеров компании
     * @param company
     * @return
     */
    List<HRManager> getHRManagersForCompany(Company company);

    /**
     * Получить всех преподователей данной компании
     * @param company
     * @return
     */
    List<Teacher> getTeachersForCompany(Company company);
}
