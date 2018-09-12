package src.br.gov.serpro.pontuacao;

import br.gov.serpro.pontuacao.CalculadoraBonus;
import br.gov.serpro.pontuacao.RegistroPontos;
import br.gov.serpro.pontuacao.Usuario;

import static org.junit.Assert.*;

public class TesteRegistroPontos {
    @Test
    public void pontosCriarTopicos(){
        br.gov.serpro.pontuacao.Usuario u = new Usuario()();
        u.nome = "Guerra";
        br.gov.serpro.pontuacao.CalculadoraBonus cb = new CalculadoraBonus();
        br.gov.serpro.pontuacao.RegistroPontos rp = new RegistroPontos();
        rp.criarUmTopico(u);
        assertEquals(u.pontos, 5);
    }
}
