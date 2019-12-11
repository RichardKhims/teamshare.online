package org.teamshare.specificator.services;

import org.teamshare.specificator.dao.SpecificatorDAO;
import org.teamshare.specificator.dao.hibernate.HibernateSpecificatorManagerQualifier;
import org.teamshare.specificator.servlets.dto.SpecificatorDTO;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@SpecificatorServiceQualifier
public class SpecificatorServiceImpl implements SpecificatorService {
    @Inject
    @HibernateSpecificatorManagerQualifier
    private SpecificatorDAO specificatorDAO;

    @Override
    public void addSpecificator(SpecificatorDTO dto) {
        specificatorDAO.addSpecificator(SpecificatorDTO.to(dto));
    }

    @Override
    public void updateSpecificator(SpecificatorDTO dto) {
        specificatorDAO.updateSpecificator(SpecificatorDTO.to(dto));
    }

    @Override
    public void deleteSpecificator(SpecificatorDTO dto) {
        specificatorDAO.deleteSpecificator(SpecificatorDTO.to(dto));
    }

    @Override
    public SpecificatorDTO getSpecificatorById(Long id) {
        return SpecificatorDTO.from(specificatorDAO.getSpecificatorById(id));
    }

    @Override
    public SpecificatorDTO getSpecificatorByHash(String hash) {
        return SpecificatorDTO.from(specificatorDAO.getSpecificatorByHash(hash));
    }

    @Override
    public List<SpecificatorDTO> getSpecificators() {
        return specificatorDAO.getSpecificators().stream()
                .map(SpecificatorDTO::from)
                .collect(Collectors.toList());
    }
}
