package com.reynaldo.veterinarioapirest.controllers;

import com.reynaldo.veterinarioapirest.models.Cliente;
import com.reynaldo.veterinarioapirest.services.ClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class ClienteController {

    @Autowired
    ClienteServiceImpl clienteService;

    @PostMapping("/clientes")
    public ResponseEntity<Map<String,Object>> crearCliente(@RequestBody Cliente cliente){

        Map<String,Object> respuesta = new HashMap<>();
        Cliente clienteNuevo = clienteService.save(cliente);
        respuesta.put("mensaje","El cliente ha sido creado con éxito");
        respuesta.put("cliente",clienteNuevo);
        return new ResponseEntity<>(respuesta, HttpStatus.CREATED);

    }

    @GetMapping("/clientes")
    public List<Cliente> obtenerClientes(){
        return clienteService.findAll();
    }

    @GetMapping("/clientes/{id}")
    public Cliente obtenerCliente(@PathVariable Long id){
        return  clienteService.findById(id);
    }

    @PutMapping("/clientes/{id}")
    public ResponseEntity<Map<String,Object>> actualizarCliente(@RequestBody Cliente cliente,@PathVariable Long id){

        Map<String,Object> respuesta = new HashMap<>();
        Cliente clienteAcual = clienteService.findById(id);
        Cliente clienteActualizado = null;

        clienteAcual.setNombre(cliente.getNombre());
        clienteAcual.setApellido(cliente.getApellido());
        clienteAcual.setDireccion(cliente.getDireccion());
        clienteAcual.setTelefono(cliente.getTelefono());

        clienteActualizado = clienteService.save(clienteAcual);
        respuesta.put("mensaje","El cliente ha sido actualizado con éxito");
        respuesta.put("cliente",clienteActualizado);

        return new ResponseEntity<>(respuesta,HttpStatus.OK);
    }

    @DeleteMapping("/clientes/{id}")
    public ResponseEntity<Map<String,Object>> eliminarCliente(@PathVariable Long id){

        Map<String,Object> respuesta = new HashMap<>();

        clienteService.delete(id);
        respuesta.put("mensaje","El cliente con id: "+id+" ,ha sido eliminado con éxito");

        return new ResponseEntity<>(respuesta,HttpStatus.OK);
    }

}
