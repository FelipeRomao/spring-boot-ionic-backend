package com.feliperomao.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feliperomao.cursomc.domain.Pedido;
import com.feliperomao.cursomc.repositories.PedidoRepository;
import com.feliperomao.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;
	
	public Pedido pesquisar(Integer id) {
		Pedido obj = repo.findOne(id);
		
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! id: " + id + 
						", Tipo: " + Pedido.class.getName());
			
		}
		
		return obj;
	}
	
}
