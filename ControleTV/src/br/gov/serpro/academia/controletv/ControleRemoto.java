package br.gov.serpro.academia.controletv;

public class ControleRemoto {
		
		private TV tv;
		
		public ControleRemoto(TV tv) {
			this.tv = tv;
		}

		public int escolherCanal(int canal) {
			return tv.escolherCanal(canal);
	
		}

		public int aumentarCanais() {
			return tv.aumentarCanais();
		}
		
		public int diminuirCanais() {
			return tv.diminuirCanais();
		}
		
		public int aumentarVolume() {
			return tv.aumentarVolume();
		}

		public int diminuirVolume() {
			return tv.diminuirVolume();
		}
		
		public void ligarDesligar() {
			 tv.ligarDesligar();
		}

}