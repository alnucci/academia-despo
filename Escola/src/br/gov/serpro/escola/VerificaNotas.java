package br.gov.serpro.escola;

public class VerificaNotas {

    public static int mediaAluno(br.gov.serpro.escola.Aluno a){
        int total = 0;
        total += a.bim1;
        total += a.bim2;
        total += a.bim3;
        total += a.bim4;
        return total / 4;

    }

    public static boolean passouDeAno(br.gov.serpro.escola.Aluno a ){

        int media = mediaAluno(a);
        if(media >= 60)
            return true;
        return false;

    }
}
