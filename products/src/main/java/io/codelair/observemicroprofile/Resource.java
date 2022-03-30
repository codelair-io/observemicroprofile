package io.codelair.observemicroprofile;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Path("/products")
@Produces(MediaType.APPLICATION_JSON)
public class Resource {
  @GET
  public List<Product> fetch() {
    return Arrays.asList(
        new Product(UUID.randomUUID(), "Produkt ett"),
        new Product(UUID.randomUUID(), "Produkt två"));
  }
}
