package com.example.proyecto.repository;


import com.example.clase1.entities.pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface pedidoRepository extends JpaRepository<pedido,Long> {
}
