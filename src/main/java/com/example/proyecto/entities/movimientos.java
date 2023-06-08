package com.example.proyecto.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Data
@Entity
@Table(name = "movimientos")
public class movimientos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movimientoId;

    private Date fecha;
    private Double costo;
    @Column(nullable = false)
    private long productoId;
}
