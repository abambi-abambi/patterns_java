package org.patterns.myproject.service.facade;

import lombok.RequiredArgsConstructor;
import org.patterns.myproject.domain.Fruit;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * combines several services
 * and fulfills some business-scenario
 */
@Service
@RequiredArgsConstructor
public class FruitServiceFacadeImpl implements FruitServiceFacade {

    private final AppleService appleService;
    private final OrangeService orangeService;

    /**
     * some custom business logic
     */
    @Override
    public List<Fruit> getFruitsByCount(int fruitCount) {
        if (fruitCount < 2) {
            return List.of(appleService.get());
        }
        var resultList = new ArrayList<Fruit>(
                IntStream.range(0, fruitCount / 2).mapToObj(digit -> appleService.get()).toList()
        );
        resultList.addAll(IntStream.range(resultList.size(), fruitCount).mapToObj(digit -> orangeService.get()).toList());

        return resultList;
    }
}
