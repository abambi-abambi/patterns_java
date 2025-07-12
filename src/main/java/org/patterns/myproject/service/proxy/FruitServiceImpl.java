package org.patterns.myproject.service.proxy;

import lombok.extern.slf4j.Slf4j;
import org.patterns.myproject.domain.Fruit;
import org.springframework.stereotype.Service;

@Slf4j
@Service("proxyFruitService")
public class FruitServiceImpl implements FruitService {
    @Override
    public Fruit add(Fruit fruit) {
        log.info("add fruit");
        return null;
    }

    @Override
    public Fruit edit(Fruit fruit) {
        log.info("edit fruit");
        return null;
    }

    @Override
    public void delete(Long id) {
        log.info("delete fruit");
    }
}
