package com.senaidev.loja.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_endereco")
public class Endereco {

	
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_endereco;
	
	@Column(name = "rua", length = 50, nullable = false)
	private String rua;
	
	@Column(name = "bairro", length = 50, nullable = false)
	private String bairro;
	
	@Column(name = "numero casa", length = 5, nullable = false)
	private int numero_casa;
	
	@Column(name = "cidade", length = 30, nullable = false)
	private String cidade;
	
	@Column(name = "estado", length = 2, nullable = false)
	private String estado;
	
	
	//Construtores
	public Endereco() {
		
	}
	
	public Endereco(Long id_endereco, String rua, String bairro, int numero_casa, String cidade, String estado) {
		this.id_endereco = id_endereco;
		this.rua = rua;
		this.bairro = bairro;
		this.numero_casa = numero_casa;
		this.cidade = cidade;
		this.estado = estado;
	}

	
	//Getters ad Setters
	public Long getId_endereco() {
		return id_endereco;
	}

	public void setId_endereco(Long id_endereco) {
		this.id_endereco = id_endereco;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getNumero_casa() {
		return numero_casa;
	}

	public void setNumero_casa(int numero_casa) {
		this.numero_casa = numero_casa;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	
}
