package br.serpro.academia.trabalhofinal;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Transacao {

		private LocalDate data;
		private String debitoOuCredito;
		private String descricao;
		private BigDecimal valor;

		public LocalDate getData() {
			return data;
		}

		public String getDebitoOuCredito() {
			return debitoOuCredito;
		}

		public String getDescricao() {
			return descricao;
		}

		public BigDecimal getValor() {
			return valor;
		}


	}
