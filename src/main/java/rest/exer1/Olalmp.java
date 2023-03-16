package rest.exer1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.awt.*;
import java.util.Date;

@Path("/ola")
public class Olalmp implements Ola{

    @GET
    @Override
    @Produces(MediaType.TEXT_PLAIN)
    public String servico() {
        return "Ola mundo!" + new Date();
    }
}
