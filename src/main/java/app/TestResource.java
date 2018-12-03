package app;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class TestResource {

    @GET
    public String get() {
        return "hello from test resource";
    }
}
