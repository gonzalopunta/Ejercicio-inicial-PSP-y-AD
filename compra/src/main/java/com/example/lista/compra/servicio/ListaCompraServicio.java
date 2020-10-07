package com.example.lista.compra.servicio;

import com.example.lista.compra.modelo.ListaCompra;
import com.example.lista.compra.repositorio.ListaCompraRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ListaCompraServicio extends ServicioBaseImpl <ListaCompra, Long, ListaCompraRepositorio> {

    public List<ListaCompra> mostrarListaDeLaCompra(){
        return this.findAll().stream().map(p -> {
            p.setNombreProducto(p.getNombreProducto());
            p.setCantidad(p.getCantidad());
            p.setObservacion(p.getObservacion());
            return p;
        }).collect(Collectors.toList());
    }

}
