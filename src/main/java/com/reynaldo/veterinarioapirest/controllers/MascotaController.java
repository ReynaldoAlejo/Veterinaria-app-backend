package com.reynaldo.veterinarioapirest.controllers;

import com.reynaldo.veterinarioapirest.models.Mascota;
import com.reynaldo.veterinarioapirest.services.MascotaService;
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
public class MascotaController {

    @Autowired
    MascotaService mascotaService;

    @PostMapping("/mascotas")
    public ResponseEntity<Map<String,Object>> crearMascota(@RequestBody Mascota mascota){
        Map<String,Object> respuesta = new HashMap<>();
        Mascota mascotaNueva = mascotaService.save(mascota);

        respuesta.put("mensaje","Mascota creada con éxito");
        respuesta.put("mascota",mascotaNueva);

        return new ResponseEntity<>(respuesta, HttpStatus.CREATED);
    }

    @GetMapping("/mascotas")
    public List<Mascota> ObtenerMascotas(){
        return mascotaService.findAll();
    }

    @GetMapping("/mascotas/{id}")
    public Mascota ObtenerMascota(@PathVariable Long id){
        return mascotaService.findById(id);
    }

    @PutMapping("/mascotas/{id}")
    public ResponseEntity<Map<String,Object>> actualizarMascota(@RequestBody Mascota mascota,@PathVariable Long id){

        Map<String,Object> respuesta = new HashMap<>();
        Mascota mascotaActual = mascotaService.findById(id);
        Mascota mascotaActualizada = null;

        mascotaActual.setNombre(mascota.getNombre());
        mascotaActual.setRaza(mascota.getRaza());
        mascotaActual.setFoto(mascota.getFoto());
        mascotaActual.setCliente(mascota.getCliente());
        mascotaActualizada = mascotaService.save(mascotaActual);
        respuesta.put("mensaje","Datos de mascota actualizada con éxito");
        respuesta.put("mascota",mascotaActualizada);

        return new ResponseEntity<>(respuesta,HttpStatus.CREATED);

    }

    @DeleteMapping("/mascotas/{id}")
    public ResponseEntity<Map<String,Object>> eliminarMascota(@PathVariable Long id){

        Map<String,Object> respuesta = new HashMap<>();

        mascotaService.delete(id);
        respuesta.put("mensaje","La mascota con id: "+id+" ,ha sido eliminado con éxito");

        return new ResponseEntity<>(respuesta,HttpStatus.OK);
    }

}
