package org.patterns.myproject.service.adapter;

import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

/**
 * Hand-made Adapter
 */
public interface BaseAdapter<T,D> {
    default D mapToDto(T src) {
        throw new UnsupportedOperationException("Метод mapToDto() не реализован для данного адаптера");
    }

    default T mapToEntity(D src) {
        throw new UnsupportedOperationException("Метод mapToEntity() не реализован для данного адаптера");
    }

    default List<D> mapToDtoList(List<T> srcList) {
        return Optional.ofNullable(srcList)
                .orElse(List.of())
                .stream()
                .map(this::mapToDto)
                .toList();
    }

    default List<T> mapToEntityList(List<D> srcList) {
        return Optional.ofNullable(srcList)
                .orElse(List.of())
                .stream()
                .map(this::mapToEntity)
                .toList();
    }
}
