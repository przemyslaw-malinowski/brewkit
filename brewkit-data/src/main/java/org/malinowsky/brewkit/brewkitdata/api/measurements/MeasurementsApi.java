package org.malinowsky.brewkit.brewkitdata.api.measurements;

import org.malinowsky.brewkit.brewkitdata.api.measurements.output.json.Measurement;
import org.malinowsky.brewkit.brewkitdata.api.measurements.output.json.Measurements;
import org.malinowsky.brewkit.brewkitdata.facades.MeasurementFacade;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.stream.Collectors;

@Path("/measurements")
public class MeasurementsApi {
    @EJB
    MeasurementFacade measurementFacade;

    @GET
    @Produces("application/json")
    public Response getAll() {
        return Response
                .ok(getMeasurements())
                .build();
    }

    private Measurements getMeasurements() {
        List<Measurement> measurements = measurementFacade
                .getAll()
                .stream()
                .map(Measurement::new)
                .collect(Collectors.toList());
        return new Measurements(measurements);
    }
}
