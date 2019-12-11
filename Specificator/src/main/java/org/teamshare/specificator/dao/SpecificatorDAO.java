package org.teamshare.specificator.dao;

import org.teamshare.specificator.dao.entity.Specificator;

public interface SpecificatorDAO {
    void addSpecificator(Specificator specificator);
    void updateSpecificator(Specificator specificator);
    void deleteSpecificator(Specificator specificator);
    Specificator getSpecificatorById(Long id);
    Specificator getSpecificatorByHash(String hash);
}
