package org.patterns.myproject.service.flyweight;

import lombok.extern.slf4j.Slf4j;
import org.patterns.myproject.domain.Fruit;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class FruitServiceFlyweightImpl implements FruitServiceFlyweight {

    /**
     * TODO: some fruit storage Set<Fruit>
     *  domain Fruit should have an EqualsAndHashcode methods
     */

    /**
     * In case of large memory load
     * or storage usage is not effective: stored fruits are identical
     * hashcode & equals return the same info
     */
    @Override
    public Fruit add(Fruit fruit) {
        // TODO check should we create the new fruit
        // or we can use the already created fruit
        log.info("added fruit via flyweight");
        return new Fruit();
    }

    @Override
    public Fruit getByName(String name) {
        // TODO return the earlier created fruit
        log.info("got fruit via flyweight");
        return new Fruit();
    }
}
