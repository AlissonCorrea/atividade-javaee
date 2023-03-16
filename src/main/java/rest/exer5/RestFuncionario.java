package rest.exer5;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.math.BigDecimal;

@Path("/funcionario")
public class RestFuncionario {

    @Path("/xml")
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Funcionario servicoXml()
    {
        System.out.println("Criando objeto em xml");
        Funcionario contato = criar();
        return contato;
    }

    @Path("/json")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Funcionario servicoJson()
    {
        System.out.println("Criando objeto em json");
        Funcionario contato = criar();
        return contato;
    }

    private Funcionario criar()
    {
        Funcionario funcionario = new Funcionario();
        funcionario.setCpf(100L);
        funcionario.setNome("Alisson Corrêa");
        funcionario.setSalario(BigDecimal.valueOf(585));

        return funcionario;
    }




}
