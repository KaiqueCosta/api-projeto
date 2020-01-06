package com.projeto.ApiProjeto.Usuario;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Usuario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	private String email;
	private String password;
	private String phone;

	public Usuario() {

	}

	public Usuario(Long id, String nome, String email, String password, String phone) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.password = password;
		this.phone = phone;
	}

}
