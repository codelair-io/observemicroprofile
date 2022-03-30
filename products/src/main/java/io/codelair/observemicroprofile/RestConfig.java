package io.codelair.observemicroprofile;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Trigger-class for JAX-RS-resources.
 */
@ApplicationPath("/api")
public class RestConfig extends Application {
  // intentionally left empty
}
