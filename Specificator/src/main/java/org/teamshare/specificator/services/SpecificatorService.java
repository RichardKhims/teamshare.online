package org.teamshare.specificator.services;

import org.teamshare.specificator.servlets.dto.SpecificatorDTO;

import java.util.List;

public interface SpecificatorService {
    void addSpecificator(SpecificatorDTO dto);
    void updateSpecificator(SpecificatorDTO dto);
    void deleteSpecificator(SpecificatorDTO dto);
    SpecificatorDTO getSpecificatorById(Long id);
    SpecificatorDTO getSpecificatorByHash(String hash);
    List<SpecificatorDTO> getSpecificators();
}
