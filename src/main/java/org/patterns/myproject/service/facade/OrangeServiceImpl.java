package org.patterns.myproject.service.facade;

import org.patterns.myproject.domain.Orange;
import org.springframework.stereotype.Service;

@Service
public class OrangeServiceImpl implements OrangeService {
    @Override
    public Orange get() {
        return Orange.builder().name("big orange orange").build();
    }
}
