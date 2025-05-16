package com.reservas.sistema.controller;

import com.reservas.sistema.model.Usuario;
import com.reservas.sistema.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final UsuarioService servicio;

    public UsuarioController(UsuarioService servicio) {
        this.servicio = servicio;
    }

    @GetMapping
    public List<Usuario> listar() {
        return servicio.listar();
    }

    @PostMapping
    public Usuario crear(@Valid @RequestBody Usuario usuario) {
        return servicio.guardar(usuario);
    }
}
