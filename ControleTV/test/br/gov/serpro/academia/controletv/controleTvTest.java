package br.gov.serpro.academia.controletv;

import static org.junit.Assert.*;

import org.junit.Test;

import br.gov.serpro.academia.controletv.ControleRemoto;
import br.gov.serpro.academia.controletv.TV;

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
	//		int canalMudado = controleRemoto.escolherCanal(1);
			controleRemoto.aumentarCanais();
			int canalAumentado = controleRemoto.aumentarCanais();
			assertEquals(5, canalAumentado);
		}
			
		@Test
		public void testDiminuirCanais() {
			Integer[] canais = {1,5,6,8,9,10,11,12,13};
			
			TV tv = new TV(canais);
			ControleRemoto controleRemoto = new ControleRemoto(tv);
//			int canalMudado = controleRemoto.escolherCanal(5);
//			controleRemoto.aumentarCanais();
//			controleRemoto.aumentarCanais();

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
			controleRemoto.aumentarVolume();

			controleRemoto.diminuirVolume();
			controleRemoto.diminuirVolume();
			int volume = controleRemoto.diminuirVolume();
			assertEquals(2, volume);
			
		}
		
		@Test
		public void testLigarTv() {
			Integer[] canais = {1,3,5,6,7,8,9,10,11,12,13};
			
			TV tv = new TV(canais);
			ControleRemoto controleRemoto = new ControleRemoto(tv);
			//controleRemoto.ligarDesligar();
			assertEquals(true, controleRemoto.ligarDesligar());
			
		}
		
		@Test
		public void testLigarDesligarTv() {
			Integer[] canais = {1,3,5,6,7,8,9,10,11,12,13};
			
			TV tv = new TV(canais);
			ControleRemoto controleRemoto = new ControleRemoto(tv);
			controleRemoto.ligarDesligar();
			
			assertEquals(false, controleRemoto.ligarDesligar());
			
		}


	}
