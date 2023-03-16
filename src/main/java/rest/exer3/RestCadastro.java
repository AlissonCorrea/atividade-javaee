package rest.exer3;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/cadastro/{username: [a-zA-Z]*}")
public class RestCadastro {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String cadastrar(@PathParam("username") String nome) {
        System.out.println("Processo cadastro de = " + nome);
        return "Cadastro feito com sucesso para " + nome;
    }
}
