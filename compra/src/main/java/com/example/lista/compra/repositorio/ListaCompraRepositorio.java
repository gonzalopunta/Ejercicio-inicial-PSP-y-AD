package com.example.lista.compra.repositorio;

import com.example.lista.compra.modelo.ListaCompra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListaCompraRepositorio extends JpaRepository<ListaCompra, Long> {

}
