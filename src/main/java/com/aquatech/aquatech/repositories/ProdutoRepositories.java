package com.aquatech.aquatech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aquatech.aquatech.entities.Produto;

public interface ProdutoRepositories extends JpaRepository<Produto, Long> {

}
