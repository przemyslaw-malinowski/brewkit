package org.malinowsky.brewkit.brewkitdata.api.productType;

import org.infinispan.Cache;
import org.malinowsky.brewkit.brewkitdata.api.productType.input.json.ProductType;
import org.malinowsky.brewkit.brewkitdata.facades.ProductTypeFacade;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

@Path("/product-type")
public class ProductTypeResource {

    @EJB
    ProductTypeFacade productTypeFacade;

    @GET
    @Path("get-all")
    @Produces("application/json")
    public Response getAll() {
        return Response
                .ok(productTypeFacade.getAll())
                .build();
    }

    @POST
    @Path("add")
    @Consumes("application/json")
    public Response add(ProductType productType) {
        productTypeFacade.add(productType);
        return Response.ok().build();
    }
}
