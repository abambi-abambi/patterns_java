package org.patterns.myproject.runner;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.patterns.myproject.domain.Fruit;
import org.patterns.myproject.service.proxy.FruitServiceProxy;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;


@Slf4j
@Component
@RequiredArgsConstructor
public class ProxyRunner implements CommandLineRunner {

//    private final FruitService fruitService; // old
    private final FruitServiceProxy fruitService;
    @Override
    public void run(String... args) throws Exception {
        log.info("--- Proxy example ---");

        var apple = new Fruit("red apple", BigDecimal.TWO);
        fruitService.add(apple);
        fruitService.edit(apple);
        fruitService.delete(2L);
    }
}
