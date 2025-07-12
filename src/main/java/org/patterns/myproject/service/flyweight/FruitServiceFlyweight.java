package org.patterns.myproject.service.flyweight;

import org.patterns.myproject.domain.Fruit;

public interface FruitServiceFlyweight {
    Fruit add(Fruit fruit);

    Fruit getByName(String name);
}
