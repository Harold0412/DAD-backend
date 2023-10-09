package com.example.mspedido.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;


@Data
public class Producto {
    private Integer id;
    private String nombre;
    private Categoria categoria;




}
