package org.patterns.myproject.service.decorator;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.patterns.myproject.domain.Fruit;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class FruitServiceDecoratorImpl implements FruitServiceDecorator {
    private final FruitServiceImpl fruitService;

    @Override
    public Fruit add(Fruit fruit) {
        return fruitService.add(fruit);
    }

    @Override
    public Fruit edit(Fruit fruit) {
        return fruitService.edit(fruit);
    }

    @Override
    public void delete(Long id) {
        fruitService.delete(id);
    }

    @Override
    public void cutFruit(Fruit fruit) {
        // TODO some good code
        log.info("Call the cutFruit() method");
    }
}
