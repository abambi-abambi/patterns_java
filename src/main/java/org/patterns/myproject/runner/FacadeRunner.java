package org.patterns.myproject.runner;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.patterns.myproject.service.facade.FruitServiceFacade;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class FacadeRunner implements CommandLineRunner {

    private final FruitServiceFacade fruitServiceFacade;

    @Override
    public void run(String... args) throws Exception {
        log.info("--- Facade example ---");

        log.info("get 1 fruit from facade: " + fruitServiceFacade.getFruitsByCount(1));
        log.info("get 5 fruits from facade: " + fruitServiceFacade.getFruitsByCount(5));

    }
}
