package com.aquatech.aquatech.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aquatech.aquatech.entities.Categoria;
import com.aquatech.aquatech.repositories.CategoriaRepositories;

@Service
public class CategoriaServices {
	
	@Autowired
	private CategoriaRepositories repository;
	
	public List<Categoria> findAll() {
		return repository.findAll();
	}
	
	public Categoria findById(Long id) {
		Optional<Categoria> obj = repository.findById(id);
		return obj.get();
	}

}
