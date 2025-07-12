package org.patterns.myproject.service.flyweight;

import org.patterns.myproject.domain.Fruit;

public interface FruitService {

    Fruit add(Fruit fruit);
    Fruit edit(Fruit fruit);
    void delete(Fruit fruit);
}
