package com.feliperomao.cursomc.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.feliperomao.cursomc.domain.Categoria;
import com.feliperomao.cursomc.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

	@Transactional(readOnly = true)
	Page<Produto> findDistinctByNomeContainingAndCategoriasIn(String nome, List<Categoria> categorias, Pageable pageRequest);

}
