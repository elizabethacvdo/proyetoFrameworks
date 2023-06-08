package com.example.proyecto.entities;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Data
@Entity
@Table(name = "producto")
public class producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productoId;
    private String nombre;
    private String proveedor;

    @Column(nullable = false,unique = true,length = 20)
    private String codigo;
    @Column(nullable = false)
    private long categoriaId;
    @Column(nullable = false)
    private long marcaId;
    @OneToMany(mappedBy = "movimientoId")
    private List<movimientos> salidasList;
    @OneToMany(mappedBy = "movimientoId")
    private List<movimientos> entradasList;
}
