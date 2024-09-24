package com.gabrieldev.sendemail.controller;

import br.com.caelum.stella.validation.InvalidStateException;
import com.gabrieldev.sendemail.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.gabrieldev.sendemail.Service.ClienteService;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    // Endpoint para salvar um cliente
    @PostMapping
    public ResponseEntity<?> salvarCliente(@RequestBody Cliente cliente) {
        try {
            Cliente savedCliente = clienteService.salvarCliente(cliente);
            return ResponseEntity.ok(savedCliente);
        } catch (InvalidStateException e) {
            return ResponseEntity.badRequest().body("CPF inválido: " + e.getMessage());
        }
    }

    // Endpoint para listar todos os clientes
    @GetMapping
    public ResponseEntity<List<Cliente>> listarClientes() {
        List<Cliente> clientes = clienteService.listarClientes();
        return new ResponseEntity<>(clientes, HttpStatus.OK);
    }
}
