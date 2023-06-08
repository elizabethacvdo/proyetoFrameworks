package com.example.proyecto.controller;

import com.example.clase1.entities.cliente;
import com.example.clase1.entities.pedido;
import com.example.clase1.repository.pedidoRepository;
import com.example.clase1.services.clienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/cliente")
public class clienteController {
    @Autowired
    clienteService clienteService;

    @Autowired
    pedidoRepository pedidoRepository;


    @GetMapping
    public List<cliente> getAll(){
        return clienteService.getCliente();
    }
    @GetMapping("/{clienteId}")
    public Optional<cliente> getById(@PathVariable("clienteId") Long
                                                clienteId){
        return clienteService.getCliente(clienteId);
    }

    @GetMapping("pedidos/{clienteId}")
    public List<pedido> getPedidosCliente(@PathVariable("clienteId") Long
                                                clienteId){
        List<pedido> detalles= clienteService.getCliente(clienteId).get().getPedidoList();
        return detalles;
    }


    @PostMapping(
            value = "/save", consumes = "application/json", produces = "application/json")
    public cliente save(@RequestBody cliente cliente){
        List<pedido> detalles=cliente.getPedidoList();
        cliente.setPedidoList(null);
        clienteService.saveOrUpdate(cliente);
        for(pedido det: detalles) {
            det.setClienteId(cliente.getClienteId());
        }
        pedidoRepository.saveAll(detalles);
        cliente.setPedidoList(detalles);
        return cliente;

    }


    @DeleteMapping("delete/{clienteId}")
    public void bo(@PathVariable("clienteId") Long clienteId){
        clienteService.delete(clienteId);
    }


}
