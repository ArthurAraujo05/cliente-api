package com.example.clientesapi.service;

import com.example.clientesapi.feign.ClienteFeignClient;
import com.example.clientesapi.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteFeignClient feignClient;

    public List<Cliente> getAllClientes() {
        return feignClient.getAllClientes();
    }

    public Cliente getClienteById(Long id) {
        System.out.println("Chamando a segunda aplicacao para listagem de clientes");
        return feignClient.getClienteById(id);
    }

    public Cliente createCliente(Cliente cliente) {
        System.out.println("Chamando a segunda aplicacao para criacao de clientes");
        return feignClient.createCliente(cliente);
    }

    public Cliente updateCliente(Long id, Cliente cliente) {
        System.out.println("Chamando a segunda aplicacao para update de clientes");
        return feignClient.updateCliente(id, cliente);
    }

    public void deleteCliente(Long id) {
        System.out.println("Chamando a segunda aplicacao para exclusao de clientes");
        feignClient.deleteCliente(id);
    }

    public Float calcularScore(Long id) {
        System.out.println("Chamando a segunda aplicacao para calculo de score do clientes");
        Cliente cliente = feignClient.getClienteById(id);
        if (cliente != null && cliente.getSaldoCc() != null) {
            return cliente.getSaldoCc() * 0.1f;
        }
        return null;
    }
}
