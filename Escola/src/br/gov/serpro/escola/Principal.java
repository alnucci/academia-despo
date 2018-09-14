package br.gov.serpro.escola;

public class Principal {
    public static void main(String[] args){
        br.gov.serpro.escola.Aluno guerra = new br.gov.serpro.escola.Aluno();
        guerra.bim1 = 70;
        guerra.bim2 = 60;
        guerra.bim3 = 80;
        guerra.bim4 = 70;

        System.out.println(br.gov.serpro.escola.VerificaNotas.mediaAluno(guerra));
        System.out.println(br.gov.serpro.escola.VerificaNotas.passouDeAno(guerra));

    }
}
