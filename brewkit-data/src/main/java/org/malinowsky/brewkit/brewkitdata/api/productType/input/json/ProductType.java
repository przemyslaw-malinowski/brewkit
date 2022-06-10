package org.malinowsky.brewkit.brewkitdata.api.productType.input.json;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProductType implements Serializable {
    private Integer id;
    private String code;
    private String name;
}
