package com.senaidev.loja.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_funcionario")
public class Funcionario {

	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_funcionario;
	
	@Column(name = "nome", length = 45, nullable = false)
	private String nome;
	
	@Column(name = "email", length = 45, nullable = false, unique = true)
	private String email;
	
	@Column(name = "cpf", length = 11, nullable = false, unique = true)
	private String cpf;
	
	
	//Construtores
	public Funcionario() {
		
	}
	
	public Funcionario(Long id_funcionario, String nome, String email, String cpf) {
		this.id_funcionario = id_funcionario;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	}

	
	//Getters and Setters
	public Long getId_funcionario() {
		return id_funcionario;
	}

	public void setId_funcionario(Long id_funcionario) {
		this.id_funcionario = id_funcionario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
