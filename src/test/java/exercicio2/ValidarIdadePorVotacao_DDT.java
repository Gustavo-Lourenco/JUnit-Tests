package exercicio2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static votacao.Votacao.podeVotar;

@RunWith(Parameterized.class)
public class ValidarIdadePorVotacao_DDT {

    String nome;
    int anoDeNascimento;
    String resultado;

    public ValidarIdadePorVotacao_DDT(String nome, int anoDeNascimento, String resultado){
        this.nome = nome;
        this.anoDeNascimento = anoDeNascimento;
        this.resultado = resultado;
    }

    @Test
    public void validarObrigatoriedadeDeVoto(){
        assertEquals(resultado, podeVotar(nome, anoDeNascimento));
    }

    @Parameterized.Parameters(name = "{0} | {1} | {2}")
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][] {
            { "Maria",      2007, "Maria voce nao pode votar" },
            { "Rodrigo",    2006, "Rodrigo seu voto e facultativo" },
            { "Joao",       2005, "Joao seu voto e facultativo" },
            { "Carla",      2004, "Carla seu voto e obrigatorio" },
            { "Jose",       1997, "Jose seu voto e obrigatorio" },
            { "Ana",        1952, "Ana seu voto e obrigatorio" },
            { "Pedro",      1951, "Pedro seu voto e facultativo" }
        });
    }




}
