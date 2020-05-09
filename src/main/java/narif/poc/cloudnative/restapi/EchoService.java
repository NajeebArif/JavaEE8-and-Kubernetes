package narif.poc.cloudnative.restapi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("ping")
public class EchoService {

    @GET
    public String ping(){
        return "PONG";
    }
}
