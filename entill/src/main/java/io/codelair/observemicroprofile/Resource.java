package io.codelair.observemicroprofile;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("cool/stuff")
@RequestScoped
public class Resource {
  @GET
  public Stuff fetch() {
    return new Stuff("En spännande pryl", "Fylla ut med lite kod.");
  }
}
