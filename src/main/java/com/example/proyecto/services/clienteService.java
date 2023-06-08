package com.example.proyecto.services;

import com.example.clase1.entities.cliente;
import com.example.clase1.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class clienteService {
    @Autowired
    ClienteRepository clienteRepository;
    public List<cliente> getCliente(){
        return clienteRepository.findAll();
    }
    public Optional<cliente> getCliente(Long id){
        return clienteRepository.findById(id);
    }
    public void saveOrUpdate(cliente player){
        clienteRepository.save(player);
    }
    public void delete(Long id){
        clienteRepository.deleteById(id);
    }
}
