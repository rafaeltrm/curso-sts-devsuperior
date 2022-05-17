package com.rafael.cursosts.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@RequestMapping(method = RequestMethod.GET) //requesitando uma determinada informacao
	public String listar() {
		return "REST esta funcionando!";
	}
	

}
