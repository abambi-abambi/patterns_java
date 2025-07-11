package org.patterns.myproject.service.adapter;

import org.patterns.myproject.domain.Apple;
import org.patterns.myproject.dto.AppleDto;
import org.patterns.myproject.enums.ColorType;
import org.springframework.stereotype.Component;

/**
 * Adapter creating
 */
@Component
public class AppleAdapter implements BaseAdapter<Apple, AppleDto> {
    @Override
    public AppleDto mapToDto(Apple src) {
        return AppleDto.builder()
                .fullName(src.getName())
                .weight(src.getWeight())
                .color(src.getColorType().toString())
                .build();
    }

    @Override
    public Apple mapToEntity(AppleDto src) {
        return Apple.builder()
                .name(src.getFullName())
                .weight(src.getWeight())
                .colorType(ColorType.findByStrIgnoreCase(src.getColor()))
                .build();
    }
}
