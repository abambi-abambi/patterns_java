package org.patterns.myproject.service.facade;

import org.patterns.myproject.domain.Fruit;

import java.util.List;

public interface FruitServiceFacade {
    List<Fruit> getFruitsByCount(int fruitCount);
}
