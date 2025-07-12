package org.patterns.myproject.runner;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.patterns.myproject.domain.Fruit;
import org.patterns.myproject.service.decorator.FruitServiceDecoratorImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class DecoratorRunner implements CommandLineRunner {

    private final FruitServiceDecoratorImpl fruitServiceDecorator;

    @Override
    public void run(String... args) throws Exception {
        log.info("--- Decorator example ---");

        fruitServiceDecorator.add(Fruit.builder().build());
        fruitServiceDecorator.edit(Fruit.builder().build());

        fruitServiceDecorator.cutFruit(Fruit.builder().build());

    }
}
