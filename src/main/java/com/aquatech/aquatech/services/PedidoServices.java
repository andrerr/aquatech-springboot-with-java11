package com.aquatech.aquatech.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aquatech.aquatech.entities.Pedido;
import com.aquatech.aquatech.repositories.PedidoRepositories;

@Service
public class PedidoServices {
	
	@Autowired
	private PedidoRepositories repository;
	
	public List<Pedido> findAll() {
		return repository.findAll();
	}
	
	public Pedido findById(Long id) {
		Optional<Pedido> obj = repository.findById(id);
		return obj.get();
	}

}
