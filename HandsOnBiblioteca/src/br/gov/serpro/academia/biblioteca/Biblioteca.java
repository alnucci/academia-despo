package br.gov.serpro.academia.biblioteca;

import java.util.ArrayList;
import java.util.Collection;

public class Biblioteca {
	
	private Collection<Usuario> usuariosRegistrados;
	private Collection<Livro> catalogoDeLivros;
	
	
	public Biblioteca() {
		this.usuariosRegistrados = new ArrayList<>();
		this.catalogoDeLivros = new ArrayList<>(); 
	}
	
	public void registraUsuario(Usuario usuario) {
		usuariosRegistrados.add(usuario);
	}
	
	public int quantidadeDeUsuariosRegistrados() {
		return usuariosRegistrados.size();
	}
	
	public void adicionaLivro(Livro livro) {
		catalogoDeLivros.add(livro);
	}
	
	public int quantidadeDeLivrosAdicionados() {
		return catalogoDeLivros.size();
	}
	
}
