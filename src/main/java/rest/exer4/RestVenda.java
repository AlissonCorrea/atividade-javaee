package rest.exer4;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/venda")
public class RestVenda {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String vender(@QueryParam("nome") String nome,
                         @QueryParam("produto") String produto,
                         @QueryParam("tipo") @DefaultValue("pdf") String tipo) {
        System.out.println("Venda" + nome);
        System.out.println("Produto" + produto);
        System.out.println("Tipo" + tipo);
        return "Nota fiscal = " + nome + " - " + produto + " - " + tipo;
    }
}
