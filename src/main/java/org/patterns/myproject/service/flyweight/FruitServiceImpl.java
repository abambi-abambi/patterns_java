package org.patterns.myproject.service.flyweight;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.patterns.myproject.domain.Fruit;
import org.springframework.stereotype.Service;

@Slf4j
@Service("flyweightFruitServiceImpl")
@RequiredArgsConstructor
public class FruitServiceImpl implements FruitService {

    /**
     * In case of large memory load
     * or storage usage is not effective: stored fruits are identical
     * hashcode & equals return the same info
     *
     * In these cases we begin to use a FruitServiceFlyweight
     */

//    added flyweight usage to the old realization
    private final FruitServiceFlyweight fruitServiceFlyweight;

    @Override
    public Fruit add(Fruit fruit) {
        log.info("add fruit");
//        new method
        return fruitServiceFlyweight.add(fruit);
//        old method
//        return new Fruit();
    }

    @Override
    public Fruit edit(Fruit fruit) {
        log.info("edit fruit");
        return new Fruit();
    }

    @Override
    public void delete(Fruit fruit) {
        log.info("delete");
        // TODO some deletion operations
    }
}
