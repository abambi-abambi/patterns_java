package org.patterns.myproject.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.patterns.myproject.config.StrongMapperConfig;
import org.patterns.myproject.domain.Apple;
import org.patterns.myproject.dto.AppleDto;
import org.patterns.myproject.enums.ColorType;

@Mapper(config = StrongMapperConfig.class,
    imports = ColorType.class)
public interface AppleMapper extends BaseMapper<Apple, AppleDto> {

    @Override
    @Mapping(target = "fullName", source = "name")
    @Mapping(target = "color", source = "colorType")
    AppleDto mapToDto(Apple src);

    @Override
    @Mapping(target = "name", source = "fullName")
    @Mapping(target = "colorType", expression = "java(ColorType.findByStrIgnoreCase(src.getColor()))")
    Apple mapToEntity(AppleDto src);
}