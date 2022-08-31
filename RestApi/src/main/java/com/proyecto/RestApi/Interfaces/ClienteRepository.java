package com.proyecto.RestApi.Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.RestApi.Entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
