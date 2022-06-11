package org.malinowsky.brewkit.brewkitdata.facades;

import org.malinowsky.brewkit.brewkitdata.api.productType.input.json.ProductType;
import org.malinowsky.brewkit.brewkitdata.jpa.ProductTypeEntity;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface ProductTypeFacade {
    List<ProductTypeEntity> getAll();
    ProductTypeEntity get(String code);
    void add(ProductType productType);
}
