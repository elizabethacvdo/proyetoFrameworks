package com.example.proyecto.services;

import com.example.clase1.entities.pedido;
import com.example.clase1.repository.pedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class pedidoService {
    @Autowired
    pedidoRepository pedidoRepository;
    public List<pedido> getPedido(){
        return pedidoRepository.findAll();
    }
    public Optional<pedido> getPedido(Long id){
        return pedidoRepository.findById(id);
    }


    public void saveOrUpdate(pedido pe){
        pedidoRepository.save(pe);
    }
    public void delete(Long id){
        pedidoRepository.deleteById(id);
    }
}
