package testtv;

import controletv.ControleRemoto;
import controletv.TV;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class controleTvTest {

		@Test
		public void testMudarCanal() {
			Integer[] canais = {2,4,5,7,9,11,13};
			TV tv = new TV(canais);
			ControleRemoto controleRemoto = new ControleRemoto(tv);
			int canal = controleRemoto.escolherCanal(5);
			assertEquals(5, canal);
			
		}

		@Test
		public void testAumentarCanal() {
			Integer[] canais = {2,4,5,7,9,11,13};
			
			TV tv = new TV(canais);
			ControleRemoto controleRemoto = new ControleRemoto(tv);
			int canalMudado = controleRemoto.escolherCanal(4);

			int canalAumentado = controleRemoto.aumentarCanais();
			assertEquals(5, canalAumentado);
		}
		
	/*
		@Test
		public void testDiminuirCanal() {
			Integer[] canais = {1,5,6,8,9,10,11,12,13};
			
			TV tv = new TV(canais);
			ControleRemoto controleRemoto = new ControleRemoto(tv);
			int canalMudado = controleRemoto.escolherCanal(5);
			int canalDiminuido = controleRemoto.diminuirCanais();
			assertEquals(1, canalDiminuido);
		}
		
		
		
		
		@Test
		public void testAumentarVolume() {
			Integer[] canais = {1,3,5,6,7,8,9,10,11,12,13};
			
			TV tv = new TV(canais);
			ControleRemoto controleRemoto = new ControleRemoto(tv);
			controleRemoto.aumentarVolume();
			controleRemoto.aumentarVolume();
			int volume = controleRemoto.aumentarVolume();
			assertEquals(3, volume);
			
		}
		
		
		@Test
		public void testBaixarVolume() {
			Integer[] canais = {1,3,5,6,7,8,9,10,11,12,13};
			
			TV tv = new TV(canais);
			ControleRemoto controleRemoto = new ControleRemoto(tv);
			controleRemoto.aumentarVolume();
			controleRemoto.aumentarVolume();
			controleRemoto.aumentarVolume();
			int volume = controleRemoto.diminuirVolume();
			assertEquals(2, volume);
			
		}
		

		@Test
		public void testLigarTv() {
			int[] canais = {1,3,5,6,7,8,9,10,11,12,13};
			
			TV tv = new TV(canais);
			ControleRemoto controleRemoto = new ControleRemoto(tv);
			
			int volume = controleRemoto.diminuirVolume();
			assertEquals(true, controleRemoto.ligarDesligar());
			
		}
		
		@Test
		public void testLigarDesligarTv() {
			int[] canais = {1,3,5,6,7,8,9,10,11,12,13};
			
			TV tv = new TV(canais);
			ControleRemoto controleRemoto = new ControleRemoto(tv);
			controleRemoto.ligarDesligar();
			int volume = controleRemoto.diminuirVolume();
			assertEquals(false, controleRemoto.ligarDesligar());
			
		}

*/
	}

