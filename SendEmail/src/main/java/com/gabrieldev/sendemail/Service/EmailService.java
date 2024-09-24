package com.gabrieldev.sendemail.Service;


import com.gabrieldev.sendemail.model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gabrieldev.sendemail.repository.EmailRepository;

import java.util.List;

@Service
public class EmailService {

    @Autowired
    private EmailRepository emailRepository;

    public Email criarEmail(Email email) {
        System.out.printf("estive aqui");
        return emailRepository.save(email);

    }

    public List<Email> listarEmails() {
        return emailRepository.findAll();
    }

}
