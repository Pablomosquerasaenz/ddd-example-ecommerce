package com.ttulka.ecommerce.warehouse;

import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.ToString;

/**
 * Warehouse In Stock Product Code domain primitive.
 */
@EqualsAndHashCode
@ToString
public final class ProductCode {

    private final @NonNull String code;

    public ProductCode(@NonNull String code) {
        var codeVal = code.strip();
        if (codeVal.isBlank()) {
            throw new IllegalArgumentException("Code cannot be empty!");
        }
        if (codeVal.length() > 50) {
            throw new IllegalArgumentException("Code cannot be longer than 50 characters!");
        }
        this.code = codeVal;
    }

    public String value() {
        return code;
    }
}