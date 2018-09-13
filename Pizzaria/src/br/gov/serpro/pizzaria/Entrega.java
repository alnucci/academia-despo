package br.gov.serpro.pizzaria;

public class Entrega {
 // Calcula a entrega baseado no dia da semana e na distância
 double valorEntrega;
    String diaSemana;

    public double calculaValorEntrega(double distancia, String diaSemana) {
        this.diaSemana = diaSemana;

        if (diaSemana.equals("diaUtil") && distancia <= 3 ) {
            valorEntrega = 1.0;
        }else if (diaSemana.equals("diaUtil") && distancia > 3) {
            valorEntrega = 5.0;
        }else if (diaSemana.equals("naoDiaUtil") && distancia <= 3) {
            valorEntrega = 7.0;
        }else if (diaSemana.equals("naoDiaUtil") && distancia > 3) {
            valorEntrega = 10.0;

        }

        return valorEntrega;



    }
}
