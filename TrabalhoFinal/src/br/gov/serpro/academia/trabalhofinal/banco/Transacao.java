package br.gov.serpro.academia.trabalhofinal.banco;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Transacao {

		private LocalDate data;
		private String operacao;
		private String descricao;
		private BigDecimal valor;

		public LocalDate getData() {
			return data;
		}

		public String getOperacao() {
			return operacao;
		}

		public String getDescricao() {
			return descricao;
		}

		public BigDecimal getValor() {
			return valor;
		}


	}
