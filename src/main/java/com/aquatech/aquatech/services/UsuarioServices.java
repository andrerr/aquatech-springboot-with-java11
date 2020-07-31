package com.aquatech.aquatech.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aquatech.aquatech.entities.Usuario;
import com.aquatech.aquatech.repositories.UsuarioRepositories;

@Service
public class UsuarioServices {
	
	@Autowired
	private UsuarioRepositories repository;
	
	public List<Usuario> findAll() {
		return repository.findAll();
	}
	
	public Usuario findById(Long id) {
		Optional<Usuario> obj = repository.findById(id);
		return obj.get();
	}

}
