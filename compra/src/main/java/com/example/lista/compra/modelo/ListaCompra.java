package com.example.lista.compra.modelo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity @Data @Builder @AllArgsConstructor @NoArgsConstructor
public class ListaCompra {

    @Id @GeneratedValue
    private long id;

    private String nombreProducto;
    private int cantidad;
    private String observacion;

}
