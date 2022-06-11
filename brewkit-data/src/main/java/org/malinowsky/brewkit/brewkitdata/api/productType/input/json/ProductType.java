package org.malinowsky.brewkit.brewkitdata.api.productType.input.json;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProductType implements Serializable {
    private String code;
    private String name;
    private Integer userId;
}
