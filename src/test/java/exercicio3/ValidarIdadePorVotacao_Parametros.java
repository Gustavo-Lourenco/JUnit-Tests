package exercicio3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.Parameter;
import votacao.Votacao;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ValidarIdadePorVotacao_Parametros extends Votacao {

    @Parameter(0) public String nome;
    @Parameter(1) public int anoDeNascimento;
    @Parameter(2) public String resultado;

    @Test
    public void validarObrigatoriedadeDeVoto(){
        assertEquals(resultado, Votacao.podeVotar(nome, anoDeNascimento));
    }

    @Parameters(name = "{0} | {1} | {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Maria", 2007, "Maria voce nao pode votar"},
                {"Rodrigo", 2006, "Rodrigo seu voto e facultativo"},
                {"Joao", 2005, "Joao seu voto e facultativo"},
                {"Carla", 2004, "Carla seu voto e obrigatorio"},
                {"Jose", 1997, "Jose seu voto e obrigatorio"},
                {"Ana", 1952, "Ana seu voto e obrigatorio"},
                {"Pedro", 1951, "Pedro seu voto e facultativo"}
        });
    }

}
