package org.malinowsky.brewkit.brewkitdata.ejb;

import org.malinowsky.brewkit.brewkitdata.facades.AlcoholTypeFacade;
import org.malinowsky.brewkit.brewkitdata.jpa.AlcoholGeneralTypeEntity;
import org.malinowsky.brewkit.brewkitdata.jpa.AlcoholSubtypeEntity;

import javax.ejb.Stateless;
import java.util.Collection;

@Stateless
public class AlcoholTypeBean implements AlcoholTypeFacade {
    @Override
    public Collection<AlcoholGeneralTypeEntity> getAllGeneral() {
        return null;
    }

    @Override
    public Collection<AlcoholSubtypeEntity> getAllSubtypes() {
        return null;
    }

    @Override
    public void addSubtype(AlcoholSubtypeEntity entity) {

    }
}
