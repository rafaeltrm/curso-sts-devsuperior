package com.rafael.cursosts.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafael.cursosts.domain.Categoria;
import com.rafael.cursosts.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired // instancia dependencia de objeto tipo CategoriaRepository
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) { // busca categoria com ID e retorna categoria
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
