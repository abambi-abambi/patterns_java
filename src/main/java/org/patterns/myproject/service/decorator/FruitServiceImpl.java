package org.patterns.myproject.service.decorator;

import org.patterns.myproject.domain.Fruit;
import org.springframework.stereotype.Service;

@Service
public class FruitServiceImpl implements FruitService {
    @Override
    public Fruit add(Fruit fruit) {
        //TODO some code
        return Fruit.builder().build();
    }

    @Override
    public Fruit edit(Fruit fruit) {
        //TODO some code
        return Fruit.builder().build();
    }

    @Override
    public void delete(Long id) {
        //TODO some code
    }
}
