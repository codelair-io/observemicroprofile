package io.codelair.observemicroprofile;

import org.eclipse.microprofile.metrics.annotation.Counted;
import org.eclipse.microprofile.opentracing.Traced;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RequestScoped
@Path("/products")
@Produces(MediaType.APPLICATION_JSON)
public class Resource {
  @GET
  @Traced(operationName = "products.list")
  @Counted(name = "count_vlad_tepes")
  public List<Product> fetch() {
    return Arrays.asList(
        new Product(UUID.randomUUID(), "Produkt ett"),
        new Product(UUID.randomUUID(), "Produkt två"));
  }
}
