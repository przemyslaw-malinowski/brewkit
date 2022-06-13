package org.malinowsky.brewkit.brewkitdata.api.measurements.output.json;

import lombok.Data;
import org.malinowsky.brewkit.brewkitdata.jpa.MeasuresRecipe;

import java.io.Serializable;

@Data
public class Measurement implements Serializable {
    private Integer id;
    private String name;
    private String shortname;
    private Integer version;

    public Measurement(MeasuresRecipe measuresRecipe) {
        id = measuresRecipe.getId();
        name = measuresRecipe.getName();
        shortname = measuresRecipe.getShortName();
        version = measuresRecipe.getVersion();
    }
}
