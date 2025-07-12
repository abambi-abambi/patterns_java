package org.patterns.myproject.runner;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.patterns.myproject.domain.Apple;
import org.patterns.myproject.dto.AppleDto;
import org.patterns.myproject.enums.ColorType;
import org.patterns.myproject.service.adapter.AppleAdapter;
import org.patterns.myproject.service.mapper.AppleMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class AdapterRunner implements CommandLineRunner {

    private final AppleAdapter appleAdapter;
    private final AppleMapper appleMapper;

    @Override
    public void run(String... args) throws Exception {
        var apple = Apple.builder()
                .name("apple")
                .weight(BigDecimal.TEN)
                .colorType(ColorType.GREEN)
                .build();

        var appleDto = AppleDto.builder()
                .fullName("Chineese apple")
                .weight(BigDecimal.ONE)
                .color(ColorType.RED.toString())
                .build();

        log.info("--- Adapter example ---");
        log.info("Adapter apple to appleDto: {}", appleAdapter.mapToDto(apple));
        log.info("Adapter appleDto to apple: {}", appleAdapter.mapToEntity(appleDto));

        log.info("Adapter appleList null: {}", appleAdapter.mapToDtoList(null));
        log.info("Adapter appleList one: {}", appleAdapter.mapToDtoList(List.of(apple)));
        log.info("Adapter appleList two: {}", appleAdapter.mapToDtoList(List.of(apple, apple)));

        log.info("--- MapStruct example ---");
        log.info("MapStruct mapper apple to appleDto: {}", appleMapper.mapToDto(apple));
        log.info("MapStruct mapper appleDto to apple: {}", appleMapper.mapToEntity(appleDto));

        log.info("MapStruct mapper appleList null: {}", appleMapper.mapToDtoList(null));
        log.info("MapStruct mapper appleList one: {}", appleMapper.mapToDtoList(List.of(apple)));
        log.info("MapStruct mapper appleList two: {}", appleMapper.mapToDtoList(List.of(apple, apple)));
    }
}
