package com.example.mspedido.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Data
public class Cliente {
    private Integer id;
    private String nombre;
    private String dni;
    private String direccion;
    private Integer telefono;
}
