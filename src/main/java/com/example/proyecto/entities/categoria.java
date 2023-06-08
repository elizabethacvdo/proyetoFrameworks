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
@Table(name = "categoria")
public class categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoriaId;
    private String tipo;
    @OneToMany(mappedBy = "ProductoId")
    private List<producto> productoList;
}
