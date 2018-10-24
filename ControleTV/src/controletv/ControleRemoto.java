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
		
		public int diminuirCanais() {
			return tv.diminuirCanais();
		}
		
		public int aumentarVolume(int volume) {
			return tv.aumentarVolume(volume);
		}

		public int diminuirVolume(int volume) {
			return tv.diminuirVolume(volume);
		}
		
		public void ligarDesligar() {
			 tv.ligarDesligar();
		}

}
