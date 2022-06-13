package org.malinowsky.brewkit.brewkitdata.ejb;

import org.infinispan.Cache;
import org.malinowsky.brewkit.brewkitdata.facades.MeasurementFacade;
import org.malinowsky.brewkit.brewkitdata.jpa.MeasuresRecipe;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.malinowsky.brewkit.brewkitdata.jpa.MeasuresRecipe.GET_ALL;

@Stateless
public class MeasurementBean implements MeasurementFacade {

    @Resource(lookup = "java:jboss/infinispan/cache/product-data/measurements")
    private Cache<Integer, MeasuresRecipe> measurements;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Collection<MeasuresRecipe> getAll() {
        if(measurements.isEmpty()) {
            loadCache();
        }
        return new ArrayList<>(measurements.values());
    }

    private void loadCache() {
        List<MeasuresRecipe> recipes = (List<MeasuresRecipe>) entityManager.createNamedQuery(GET_ALL).getResultList();
        measurements.clear();
        recipes.forEach(p -> measurements.put(p.getId(), p));
    }
}
