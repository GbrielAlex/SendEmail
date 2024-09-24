package com.gabrieldev.sendemail.Service;

import br.com.caelum.stella.validation.CPFValidator;
import com.gabrieldev.sendemail.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gabrieldev.sendemail.repository.ClienteRepository;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;


    public Cliente salvarCliente(Cliente cliente) {
        String cpgCliente = cliente.getCpf();
        if(valida(cpgCliente)){
            return clienteRepository.save(cliente);
        }
        else{
            throw new IllegalArgumentException("CPF inválido: " + cpgCliente);
        }

    }

    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    private boolean valida(String cpf){
        CPFValidator cpfValidator = new CPFValidator();
        cpfValidator.assertValid(cpf);
        try{ cpfValidator.assertValid(cpf);
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    private String imprimeCPF(String CPF) {
        return(CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." +
                CPF.substring(6, 9) + "-" + CPF.substring(9, 11));
    }


}
