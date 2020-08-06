package com.aquatech.aquatech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aquatech.aquatech.entities.Pedido;

public interface PedidoRepositories extends JpaRepository<Pedido, Long> {

}
