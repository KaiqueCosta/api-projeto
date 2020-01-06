package com.projeto.ApiProjeto.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.ApiProjeto.Usuario.Usuario;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioResource {

	@GetMapping
	public ResponseEntity<Usuario> findAll(){
		Usuario u = new Usuario(1L,"Kaqiue", "kaique@tcs.com","963674022","123456");
	return ResponseEntity.ok().body(u);
	}
	
}
