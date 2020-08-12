package com.aquatech.aquatech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aquatech.aquatech.entities.Categoria;

public interface CategoriaRepositories extends JpaRepository<Categoria, Long> {

}
