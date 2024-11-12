package com.senaidev.saraiva.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_livro")
public class Livro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_livro;
	
	@Column(name = "descrição")
	private String descricao;
	
	@Column(name = "isbn")
	private String isbn;
	
	//Construtores
	public Livro(){
		
	}
	
	public Livro(Long id_livro, String descricao, String isbn) {
		this.id_livro = id_livro;
		this.descricao = descricao;
		this.isbn = isbn;
	}

	//Getters and Setters
	public Long getId_livro() {
		return id_livro;
	}

	public void setId_livro(Long id_livro) {
		this.id_livro = id_livro;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
	
	
}
