package org.malinowsky.brewkit.brewkitdata.ejb;

import org.infinispan.Cache;
import org.malinowsky.brewkit.brewkitdata.api.productType.input.json.ProductType;
import org.malinowsky.brewkit.brewkitdata.facades.ProductTypeFacade;
import org.malinowsky.brewkit.brewkitdata.jpa.ProductTypeEntity;

import javax.annotation.Resource;
import javax.ejb.Singleton;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class ProductTypeBean implements ProductTypeFacade {

    @PersistenceContext
    private EntityManager entityManager;

    @Resource(lookup = "java:jboss/infinispan/cache/product-data/product-type")
    private Cache<Integer, Object> productTypes;

    @Override
    public List<ProductTypeEntity> getAll() {
        return new ArrayList(productTypes.values());
    }

    @Override
    @Transactional
    public void add(ProductType productType) {
        System.out.println("Wypisz mnie" + productType);
        //entityManager.persist(productType);
    }
}
