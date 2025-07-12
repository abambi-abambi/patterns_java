package org.patterns.myproject.service.proxy;

import org.patterns.myproject.domain.Fruit;

public interface FruitService {

    Fruit add(Fruit fruit);
    Fruit edit(Fruit fruit);
    void delete(Long id);
}
