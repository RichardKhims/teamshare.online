package org.teamshare.itschool.utils.converter;

import org.teamshare.itschool.dao.entity.HRManager;
import org.teamshare.itschool.servlets.dto.HRManagerDTO;

public class HRManagerConverter implements BiConverter<HRManager, HRManagerDTO> {
    @Override
    public HRManagerDTO convertTo(HRManager hrManager) {
        return null;
    }

    @Override
    public HRManager convertFrom(HRManagerDTO hrManagerDTO) {
        return null;
    }
}
