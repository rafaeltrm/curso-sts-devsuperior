package com.rafael.cursosts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafael.cursosts.domain.Categoria;

@Repository //realiza operações de acesso a dados referente ao objeto Categoria
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> { 
	
	

}
