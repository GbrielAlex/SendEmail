package com.gabrieldev.sendemail.controller;

import com.gabrieldev.sendemail.model.Cliente;
import com.gabrieldev.sendemail.model.Email;
import com.gabrieldev.sendemail.Service.EmailService;
import com.gabrieldev.sendemail.model.EmailResponseDTO;
import com.gabrieldev.sendemail.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/emails")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @Autowired
    private ClienteRepository clienteRepository; // Certifique-se de que você tem um repositório para Cliente

    @PostMapping("/criaremail/{clienteId}")
    public Email criarEmail(@RequestBody EmailResponseDTO emailDTO,@PathVariable Long clienteId) {
        Cliente cliente = clienteRepository.findById(clienteId)
                .orElseThrow(() -> new NoSuchElementException("Cliente não encontrado com id: " + clienteId));
        Email email = new Email();
        email.setCliente(cliente);  // Certifique-se de que o cliente está sendo corretamente associado
        email.setTitulo(emailDTO.getTitulo());
        email.setCorpoEmail(emailDTO.getCorpoEmail());
        email.setEmailCliente(emailDTO.getEmailCliente());
        return emailService.criarEmail(email);
    }

    @GetMapping
    public List<Email> listarEmails() {
        return emailService.listarEmails();
    }

}
