package com.gabrieldev.sendemail.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmailRequest {
    private String titulo;
    private String emailCliente;
    private String corpoEmail;
    private Long client_id;
}
