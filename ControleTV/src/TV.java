
public class TV {

	private static final int VOLUME_MINIMO = 0;
	private static final int VOLUME_MAXIMO = 50;
	
	private Integer[] canais;
	private int canal = 0;
	private int posicaoCanal = 0;
	private int volume = 0;
	
		
	public TV(Integer[] canais) {
		this.canais = canais;
		this.canal = canais[posicaoCanal];
	}
	
	public int canalAtivo() {
		return  this.canal;
	}
	
	public void aumentarCanais() {
		this.canal = canais[posicaoCanal++];
	}
	
	public void diminuirCanais() {
		this.canal = canais[posicaoCanal--];
	}
	
	public void escolherCanal(Integer canal) {
		for (int posicao = 0; posicao < canais.length; posicao++) {
			if(canal == canais[posicao]) {
				this.canal = canais[posicao];
				posicaoCanal = posicao; 
				break;
			}
		}
		
	}
	
	public void aumentarVolume() {
		if(this.volume < VOLUME_MAXIMO) { 
		this.volume = volume++;}
		else
		 this.volume = VOLUME_MAXIMO;
	}
	
	public void diminuirVolume() {
		if(this.volume > VOLUME_MINIMO) { 
			this.volume = volume--;}
			else
			 this.volume = VOLUME_MINIMO;	}

}
