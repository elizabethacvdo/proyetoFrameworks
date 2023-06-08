package com.example.proyecto.controller;

import com.example.clase1.entities.pedido;
import com.example.clase1.repository.ClienteRepository;
import com.example.clase1.services.pedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/pedido")

public class pedidoController {

    @Autowired
    pedidoService pedidoService;
    @Autowired
    ClienteRepository clienteRepository;
    @GetMapping
    public List<pedido> getAll(){
        return pedidoService.getPedido();
    }
    @GetMapping("/{pedidoId}")
    public Optional<pedido> getById(@PathVariable("pedidoId") Long
                                            playerId){
        return pedidoService.getPedido(playerId);
    }
    @PostMapping
    public void save(@RequestBody pedido pedido){
        pedidoService.saveOrUpdate(pedido);

    }





    @PostMapping("/{pedidoId}")
    public void saveUpdate(@RequestBody pedido pedido){
        pedidoService.saveOrUpdate(pedido);
    }
    @DeleteMapping("delete/{pedidoId}")
    public void bo(@PathVariable("pedidoId") Long pedidoId){
        pedidoService.delete(pedidoId);
    }
}
