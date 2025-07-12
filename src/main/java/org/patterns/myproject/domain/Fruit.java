package org.patterns.myproject.domain;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Fruit implements Serializable {
    private String name;
    private BigDecimal weight;
}
