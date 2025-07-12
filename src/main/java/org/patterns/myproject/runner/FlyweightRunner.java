package org.patterns.myproject.runner;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.patterns.myproject.domain.Fruit;
import org.patterns.myproject.service.flyweight.FruitService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Slf4j
@Component
@RequiredArgsConstructor
public class FlyweightRunner implements CommandLineRunner {

    private final FruitService fruitService;

    @Override
    public void run(String... args) throws Exception {
        log.info("--- Flyweight example ---");

        fruitService.add(new Fruit("tasty apple", BigDecimal.TEN));


    }
}
