package org.patterns.myproject.service.decorator;

import org.patterns.myproject.domain.Fruit;

public interface FruitServiceDecorator extends FruitService {
    /**
     * Cut fruit
     */
    void cutFruit(Fruit fruit);
}
