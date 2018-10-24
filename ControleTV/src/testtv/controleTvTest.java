package testtv;

import static org.junit.Assert.*;

import org.junit.Test;

import controletv.ControleRemoto;
import controletv.TV;

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
		public void testAumentarCanais() {
			Integer[] canais = {1,5,6,8,9,10,11,12,13};
			
			TV tv = new TV(canais);
			ControleRemoto controleRemoto = new ControleRemoto(tv);
			int canalMudado = controleRemoto.escolherCanal(1);
			
			int canalAumentado = controleRemoto.aumentarCanais();
			assertEquals(5, canalAumentado);
		}
			
		@Test
		public void testDiminuirCanais() {
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
			int volume1 = 0;
			TV tv = new TV(canais);
			ControleRemoto controleRemoto = new ControleRemoto(tv);
			controleRemoto.aumentarVolume(volume1++);
			controleRemoto.aumentarVolume(volume1++);
			int volume = controleRemoto.aumentarVolume(volume1);
			assertEquals(2, volume);
			
		}
		
		@Test
		public void testBaixarVolume() {
			Integer[] canais = {1,3,5,6,7,8,9,10,11,12,13};
			int volume1 = 10;

			TV tv = new TV(canais);
			ControleRemoto controleRemoto = new ControleRemoto(tv);
			controleRemoto.diminuirVolume(volume1--);
			controleRemoto.diminuirVolume(volume1--);
			controleRemoto.diminuirVolume(volume1--);
			int volume = controleRemoto.diminuirVolume(volume1);
			assertEquals(2, volume);
			
		}
		
		@Test
		public void testLigarTv() {
			Integer[] canais = {1,3,5,6,7,8,9,10,11,12,13};
			
			TV tv = new TV(canais);
			ControleRemoto controleRemoto = new ControleRemoto(tv);
			
			int volume = controleRemoto.diminuirVolume(5);
			assertEquals(true, controleRemoto.ligarDesligar(true));
			
		}
		
		@Test
		public void testLigarDesligarTv() {
			Integer[] canais = {1,3,5,6,7,8,9,10,11,12,13};
			
			TV tv = new TV(canais);
			ControleRemoto controleRemoto = new ControleRemoto(tv);
			controleRemoto.ligarDesligar();
			int volume = controleRemoto.diminuirVolume(3);
			assertEquals(false, controleRemoto.ligarDesligar());
			
		}


	}
