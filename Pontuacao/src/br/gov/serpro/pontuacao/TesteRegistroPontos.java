package src.br.gov.serpro.pontuacao;

import br.gov.serpro.pontuacao.CalculadoraBonus;
import br.gov.serpro.pontuacao.RegistroPontos;
import br.gov.serpro.pontuacao.Usuario;
import org.junit.Test;
import static org.junit.Assert.*;

// import static org.junit.Assert.*;

public class TesteRegistroPontos {
    @Test
    public void pontosCriarTopicos(){
        br.gov.serpro.pontuacao.Usuario u = new Usuario();
        u.nome = "Guerra";
        br.gov.serpro.pontuacao.CalculadoraBonus cb = new CalculadoraBonus();
        br.gov.serpro.pontuacao.RegistroPontos rp = new RegistroPontos();
        rp.criarUmTopico(u);
        org.junit.Assert.assertEquals(u.pontos, 5);

    }
    @Test
    public void pontosCriarTopicosVIP(){
        br.gov.serpro.pontuacao.Usuario u = new Usuario();
        u.nome = "Guerra";
        br.gov.serpro.pontuacao.CalculadoraBonus cb = new CalculadoraBonus();
        br.gov.serpro.pontuacao.RegistroPontos rp = new RegistroPontos();
        rp.criarUmTopico(u);
        assertEquals(u.pontos, 25);
    }
    @Test
    public void pontosCriarTopicosBonusdoDia(){
        br.gov.serpro.pontuacao.Usuario u = new Usuario();
        u.nome = "Guerra";
        br.gov.serpro.pontuacao.CalculadoraBonus cb = new CalculadoraBonus();
        cb.bonusDoDia = 3;
        br.gov.serpro.pontuacao.RegistroPontos rp = new RegistroPontos();
        rp.criarUmTopico(u);
        assertEquals(u.pontos, 15);
    }
    @Test
    public void pontosCriarTopicosVIPBonusdoDia(){
        br.gov.serpro.pontuacao.Usuario u = new Usuario();
        u.nome = "Guerra";
        u.vip - true;
        br.gov.serpro.pontuacao.CalculadoraBonus cb = new CalculadoraBonus();
        cb.bonusDoDia = 2;
        br.gov.serpro.pontuacao.RegistroPontos rp = new RegistroPontos();
        rp.criarUmTopico(u);
        assertEquals(u.pontos, 50);
    }
}
