package com.reynaldo.veterinarioapirest.controllers;

import com.reynaldo.veterinarioapirest.models.Boleta;
import com.reynaldo.veterinarioapirest.models.Servicio;
import com.reynaldo.veterinarioapirest.services.BoletaService;

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
public class BoletaController {

    @Autowired
    BoletaService boletaService;

    @PostMapping("/boletas")
    public ResponseEntity<Map<String,Object>> crearBoleta(@RequestBody Boleta boleta){

        Map<String,Object> respuesta = new HashMap<>();
        Boleta boletaNueva = boletaService.save(boleta);

        respuesta.put("mensaje","Boleta creada con éxito");
        respuesta.put("boleta",boletaNueva);

        return new ResponseEntity<>(respuesta, HttpStatus.CREATED);
    }

    @GetMapping("/boletas")
    public List<Boleta> obtenerBoletas(){
        return boletaService.findAll();
    }

    @GetMapping("/boletas/{id}")
    public Boleta obtenerBoleta(@PathVariable Long id){
        return boletaService.findBoletaById(id);
    }

    @DeleteMapping("/boletas/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void borrarBoleta(@PathVariable Long id){
        boletaService.delete(id);
    }

    @GetMapping("/boletas/filtrar-servicios/{termino}")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Servicio> filtrarServicioPorTermino(@PathVariable String termino){
        return boletaService.findServicioByTermino(termino);
    }
}
