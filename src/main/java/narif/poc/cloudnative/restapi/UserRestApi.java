package narif.poc.cloudnative.restapi;


import narif.poc.cloudnative.model.BlogUser;
import narif.poc.cloudnative.service.UserService;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("users")
public class UserRestApi {

    @EJB
    private UserService userService;

    @GET
    public Response getAllUsers(){
        GenericEntity<List<BlogUser>> ge = new GenericEntity<>(userService.getAllUsers()){};
        return Response.ok(ge,"application/json").build();
    }


}
