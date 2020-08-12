package com.aquatech.aquatech.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aquatech.aquatech.entities.Produto;
import com.aquatech.aquatech.repositories.ProdutoRepositories;

@Service
public class ProdutoServices {
	
	@Autowired
	private ProdutoRepositories repository;
	
	public List<Produto> findAll() {
		return repository.findAll();
	}
	
	public Produto findById(Long id) {
		Optional<Produto> obj = repository.findById(id);
		return obj.get();
	}

}
