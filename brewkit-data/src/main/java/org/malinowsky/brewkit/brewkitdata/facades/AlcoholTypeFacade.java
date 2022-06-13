package org.malinowsky.brewkit.brewkitdata.facades;

import org.malinowsky.brewkit.brewkitdata.jpa.AlcoholGeneralTypeEntity;
import org.malinowsky.brewkit.brewkitdata.jpa.AlcoholSubtypeEntity;

import javax.ejb.Remote;
import java.util.Collection;

@Remote
public interface AlcoholTypeFacade {
    Collection<AlcoholGeneralTypeEntity> getAllGeneral();
    Collection<AlcoholSubtypeEntity> getAllSubtypes();
    void addSubtype(AlcoholSubtypeEntity entity);
}
