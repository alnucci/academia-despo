package controletv;

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
		
		public void diminuirCanais() {
			tv.diminuirCanais();
		}
		
		public void aumentarVolume() {
			 tv.aumentarVolume();
		}

		public void diminuirVolume() {
			 tv.diminuirVolume();
		}
		
		public void ligarDesligar() {
			 tv.ligarDesligar();
		}

}
