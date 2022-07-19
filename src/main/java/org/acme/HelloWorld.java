package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.jboss.logging.Logger;

@Path("")
public class HelloWorld {

  private static final Logger LOG = Logger.getLogger(HelloWorld.class);

  @GET
  public String hello() {
    LOG.info("Hello world executed.");
    return "Hello, World!";
  }
}
