package org.teamshare.itschool.utils.converter;

import org.teamshare.itschool.dao.entity.Feedback;
import org.teamshare.itschool.servlets.dto.FeedbackDTO;

public class FeedbackConverter implements BiConverter<Feedback, FeedbackDTO> {
    @Override
    public FeedbackDTO convertTo(Feedback feedback) {
        return null;
    }

    @Override
    public Feedback convertFrom(FeedbackDTO feedbackDTO) {
        return null;
    }
}
