package com.example.lista.compra.controlador;

import com.example.lista.compra.servicio.ListaCompraServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lista")
@RequiredArgsConstructor
public class ListaCompraControlador {

    private final ListaCompraServicio listaCompraServicio;

    @GetMapping("/")
    public String listarCompra (Model lista){
    lista.addAttribute("lista", listaCompraServicio.mostrarListaDeLaCompra());
    return "lista/alimentos";
    }
}
