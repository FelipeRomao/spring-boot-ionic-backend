package com.feliperomao.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feliperomao.cursomc.domain.Categoria;
import com.feliperomao.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria pesquisar(Integer id) {
		Categoria obj = repo.findOne(id);
		return obj;
	}
	
}
