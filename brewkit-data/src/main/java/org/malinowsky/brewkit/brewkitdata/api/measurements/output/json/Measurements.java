package org.malinowsky.brewkit.brewkitdata.api.measurements.output.json;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
public class Measurements implements Serializable {
    public Measurements(List<Measurement> measurements) {
        this.measurements = measurements;
    }

    private List<Measurement> measurements;
}
