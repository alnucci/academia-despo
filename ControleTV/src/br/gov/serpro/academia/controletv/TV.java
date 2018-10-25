package br.gov.serpro.academia.controletv;

public class TV implements Controlavel {

	private static final int VOLUME_MINIMO = 0;
	private static final int VOLUME_MAXIMO = 50;

	private Integer[] canais;
	private int canal = 0;
	private int posicaoCanal = 0;
	private int volume = 0;
	private boolean ligada = false;

	public TV(Integer[] canais) {
		this.canais = canais;
		this.canal = canais[posicaoCanal];
	}

	public int aumentarCanais() {
		this.canal = canais[posicaoCanal++];
		return this.canal;
	}

	public int diminuirCanais() {
		this.canal = canais[posicaoCanal--];
		return this.canal;
	}

	public int escolherCanal(Integer canal) {
		for (int posicao = 0; posicao < canais.length; posicao++) {
			if (canal == canais[posicao]) {
				this.canal = canais[posicao];
				posicaoCanal = posicao;
				break;
			}
		}
		return this.canal;

	}

	public int aumentarVolume() {
		if (this.volume < VOLUME_MAXIMO) {
			return this.volume++;
		} else {
			return this.volume = VOLUME_MAXIMO;
		}
	}

	public int diminuirVolume() {
		if (this.volume > VOLUME_MINIMO) {
			return this.volume--;
		} else {
			return this.volume = VOLUME_MINIMO;
		}
	}
	
	public boolean ligarDesligar(){
		return ligada = !ligada;

	}

}
