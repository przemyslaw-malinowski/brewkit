package org.malinowsky.brewkit.brewkitdata.jpa;

import org.malinowsky.brewkit.brewkitdata.api.productType.input.json.ProductType;

import javax.enterprise.context.Dependent;

@Dependent
public class ProductTypeMapper {
    public ProductTypeEntity map(ProductType productType) {
        ProductTypeEntity pte = new ProductTypeEntity();
        pte.setCode(productType.getCode());
        pte.setName(productType.getName());
        pte.setUserId(productType.getUserId());
        return pte;
    }
}
