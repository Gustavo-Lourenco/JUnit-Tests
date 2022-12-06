package exercicio1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static votacao.Votacao.podeVotar;

public class ValidarIdadePorVotacao {

    @Test
    public void idadeIgual15Anos_NaoPodeVotar(){
        assertEquals("Maria voce nao pode votar", podeVotar("Maria", 2010));
    }

    @Test
    public void idadeIgual16Anos_VotoFacultativo(){
        assertEquals("Rodrigo seu voto e facultativo", podeVotar("Rodrigo", 2006));
    }

    @Test
    public void idadeIgual18Anos_VotoObrigatorio(){
        assertEquals("Carla seu voto e obrigatorio", podeVotar("Carla", 2004));
    }

    @Test
    public void idadeIgual25Anos_VotoObrigatorio(){
        assertEquals("Jose seu voto e obrigatorio", podeVotar("Jose", 1997));
    }

    @Test
    public void idadeIgual70Anos_VotoObrigatorio(){
        assertEquals("Ana seu voto e obrigatorio", podeVotar("Ana", 1952));
    }

    @Test
    public void idadeIgual71Anos_VotoFacultativo(){
        assertEquals("Pedro seu voto e facultativo", podeVotar("Pedro", 1951));
    }

}
