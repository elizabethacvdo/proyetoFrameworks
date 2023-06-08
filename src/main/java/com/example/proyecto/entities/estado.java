package com.example.proyecto.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
@Entity
@Table(name = "estado")
public class estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long estadoId;
}
