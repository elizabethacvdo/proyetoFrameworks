package com.example.proyecto.repository;

import com.example.clase1.entities.cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<cliente,Long> {
}
