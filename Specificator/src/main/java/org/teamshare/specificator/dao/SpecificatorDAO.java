package org.teamshare.specificator.dao;

import org.teamshare.specificator.dao.entity.Specificator;

import java.util.List;

public interface SpecificatorDAO {
    void addSpecificator(Specificator specificator);
    void updateSpecificator(Specificator specificator);
    void deleteSpecificator(Specificator specificator);
    Specificator getSpecificatorById(Long id);
    Specificator getSpecificatorByHash(String hash);
    List<Specificator> getSpecificators();
}
