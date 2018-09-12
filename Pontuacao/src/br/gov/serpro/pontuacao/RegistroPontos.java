package br.gov.serpro.pontuacao;

public class RegistroPontos {

    private br.gov.serpro.pontuacao.CalculadoraBonus bonus;
    public RegistroPontos(br.gov.serpro.pontuacao.CalculadoraBonus cb){
        bonus = cb;
    }

    public void fazerUmComentario(br.gov.serpro.pontuacao.Usuario u){

        u.pontos += 3 * bonus.bonus(u);
    }

    public void criarUmTopico(Usuario u){
        u.pontos += 5 * bonus.bonus(u);
    }

    public void darUmLike(Usuario u){
    u.pontos += 1* bonus.bonus(u);
    }


}
