package org.patterns.myproject.service.proxy;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.patterns.myproject.domain.Fruit;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class FruitServiceProxyImpl implements FruitServiceProxy {

    private final FruitService fruitService;

    @Override
    public Fruit add(Fruit fruit) {
        // TODO some additional logic connected with our proxy
        log.info("add by proxy");
        return fruitService.add(fruit);
    }

    @Override
    public Fruit edit(Fruit fruit) {
        // TODO some additional logic connected with our proxy
        log.info("edit by proxy");
        return fruitService.edit(fruit);
    }

    @Override
    public void delete(Long id) {
        // TODO some additional logic connected with our proxy
        log.info("delete by proxy");
        fruitService.delete(id);
    }
}
