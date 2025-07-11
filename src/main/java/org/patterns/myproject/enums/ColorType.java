package org.patterns.myproject.enums;

import org.patterns.myproject.exception.UnsupportedOperationException;

public enum ColorType {
    RED,
    GREEN,
    YELLOW;

    public static ColorType findByStrIgnoreCase(String str) {
        for (var color : ColorType.values()) {
            if (color.toString().equalsIgnoreCase(str)) {
                return color;
            }
        }
        throw new UnsupportedOperationException("Цвет %s не был найден", str);
    }
}
