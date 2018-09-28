package br.gov.serpro.academia.biblioteca;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BibliotecaTest {

	@Test
	public void quantidadeZeroQuandoNovaBiblioteca() {
		Biblioteca biblioteca = new Biblioteca();
		assertEquals(0, biblioteca.quantidadeDeUsuariosRegistrados());

	}

	@Test
	public void quantidadeUmQuandoUsuarioRegistrado() {
		Biblioteca biblioteca = new Biblioteca();
		biblioteca.registraUsuario(new Usuario());
		assertEquals(1, biblioteca.quantidadeDeUsuariosRegistrados());

	}

	@Test
	public void quantidadeZeroLivrosQuandoNovaBiblioteca() {
		Biblioteca biblioteca = new Biblioteca();
		assertEquals(0, biblioteca.quantidadeDeLivrosAdicionados());

	}

	@Test
	public void quantidadeUmQuandoLivroAdicionado() {
		Biblioteca biblioteca = new Biblioteca();
		biblioteca.adicionaLivro(new Livro());
		assertEquals(1, biblioteca.quantidadeDeLivrosAdicionados());
	}
}
