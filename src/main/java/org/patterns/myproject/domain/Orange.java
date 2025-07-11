package org.patterns.myproject.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.patterns.myproject.enums.ColorType;

import java.io.Serializable;

@Data
@SuperBuilder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Orange extends Fruit implements Serializable {
    private ColorType colorType;
}
