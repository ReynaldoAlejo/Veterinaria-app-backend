package com.reynaldo.veterinarioapirest.services;

import com.reynaldo.veterinarioapirest.models.Boleta;
import com.reynaldo.veterinarioapirest.models.Mascota;
import com.reynaldo.veterinarioapirest.models.Servicio;

import java.util.List;

public interface BoletaService {
    public Boleta save(Boleta boleta);
    public List<Boleta> findAll();
    public Boleta  findBoletaById(Long id);
    public void delete(Long id);
    public List<Servicio> findServicioByTermino(String termino);
}
