package com.aquatech.aquatech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aquatech.aquatech.entities.Usuario;

public interface UsuarioRepositories extends JpaRepository<Usuario, Long> {

}
