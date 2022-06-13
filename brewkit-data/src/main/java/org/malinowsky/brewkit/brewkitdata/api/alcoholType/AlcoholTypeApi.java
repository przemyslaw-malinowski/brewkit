package org.malinowsky.brewkit.brewkitdata.api.alcoholType;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("alcohol-type")
public class AlcoholTypeApi {
    @GET
    @Path("general")
    public Response getGeneral() {
        return Response.ok().build();
    }

    @GET
    @Path("subtype")
    public Response getSubtype() {
        return Response.ok().build();
    }
}
