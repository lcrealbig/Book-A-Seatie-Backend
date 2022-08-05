package com.userservice.services;

import com.userservice.repositories.HintsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
public class HintsService {

    @Autowired
    private HintsRepository hintsRepository;

    @Transactional
    public String displayReservationHints() {
        return hintsRepository.getReferenceById(1).getHints();
    }
}
