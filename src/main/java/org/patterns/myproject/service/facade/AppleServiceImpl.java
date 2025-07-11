package org.patterns.myproject.service.facade;

import org.patterns.myproject.domain.Apple;
import org.springframework.stereotype.Service;

@Service
public class AppleServiceImpl implements AppleService {
    @Override
    public Apple get() {
        return Apple.builder().name("new apple").build();
    }
}