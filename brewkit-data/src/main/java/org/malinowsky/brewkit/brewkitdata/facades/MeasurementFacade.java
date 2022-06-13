package org.malinowsky.brewkit.brewkitdata.facades;

import org.malinowsky.brewkit.brewkitdata.jpa.MeasuresRecipe;

import javax.ejb.Remote;
import java.util.Collection;

@Remote
public interface MeasurementFacade {
    Collection<MeasuresRecipe> getAll();
}
