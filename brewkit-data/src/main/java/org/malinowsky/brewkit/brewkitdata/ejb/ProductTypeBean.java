package org.malinowsky.brewkit.brewkitdata.ejb;

import org.infinispan.Cache;
import org.malinowsky.brewkit.brewkitdata.api.productType.input.json.ProductType;
import org.malinowsky.brewkit.brewkitdata.facades.ProductTypeFacade;
import org.malinowsky.brewkit.brewkitdata.jpa.ProductTypeEntity;
import org.malinowsky.brewkit.brewkitdata.jpa.ProductTypeMapper;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Stateless
public class ProductTypeBean implements ProductTypeFacade {

    @PersistenceContext
    private EntityManager entityManager;

    @Resource(lookup = "java:jboss/infinispan/cache/product-data/product-types")
    private Cache<String, Object> productTypes;

    @Inject
    private ProductTypeMapper mapper;

    @Override
    public List<ProductTypeEntity> getAll() {
        return new ArrayList(productTypes.values());
    }

    @Override
    public ProductTypeEntity get(String code) {
        return (ProductTypeEntity) productTypes.get(code);
    }

    @Override
    @Transactional
    public void add(ProductType productType) {
        ProductTypeEntity productTypeEntity = mapper.map(productType);
        entityManager.persist(productTypeEntity);
        entityManager.flush();
        productTypes.put(productTypeEntity.getCode(), productType);
    }
}
