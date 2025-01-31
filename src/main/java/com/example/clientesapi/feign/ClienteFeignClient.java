package com.example.clientesapi.feign;

import com.example.clientesapi.model.Cliente;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "segundaAplicacao", url = "http://localhost:8081")
public interface ClienteFeignClient {

    @GetMapping("/clientes")
    List<Cliente> getAllClientes();

    @GetMapping("/clientes/{id}")
    Cliente getClienteById(@PathVariable Long id);

    @PostMapping("/clientes")
    Cliente createCliente(@RequestBody Cliente cliente);

    @PutMapping("/clientes/{id}")
    Cliente updateCliente(@PathVariable Long id, @RequestBody Cliente cliente);

    @DeleteMapping("/clientes/{id}")
    void deleteCliente(@PathVariable Long id);

}