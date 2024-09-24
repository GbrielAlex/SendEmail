package com.gabrieldev.sendemail.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmailResponseDTO {
    private Long id;
    private String titulo;
    private String emailCliente;

    public String getCorpoEmail() {
        return emailCliente;
    }
    // Não incluir o cliente aqui ou incluir apenas os campos necessários

    // Construtores, Getters e Setters
}
