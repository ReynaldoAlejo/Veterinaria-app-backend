package com.reynaldo.veterinarioapirest.services;
import com.reynaldo.veterinarioapirest.models.Cliente;
import java.util.List;

public interface ClienteService {
    public Cliente save(Cliente cliente);
    public List<Cliente> findAll();
    public Cliente findById(Long id);
    public void delete(Long id);
}
