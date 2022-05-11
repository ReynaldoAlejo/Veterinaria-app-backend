package com.reynaldo.veterinarioapirest.services;

import com.reynaldo.veterinarioapirest.models.Boleta;
import com.reynaldo.veterinarioapirest.models.Servicio;
import com.reynaldo.veterinarioapirest.repositories.BoletaRepository;
import com.reynaldo.veterinarioapirest.repositories.ServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoletaServiceImpl implements BoletaService {

    @Autowired
    BoletaRepository boletaRepository;

    @Autowired
    ServicioRepository servicioRepository;

    @Override
    public Boleta save(Boleta boleta) {
        return boletaRepository.save(boleta);
    }

    @Override
    public List<Boleta> findAll() {
        return boletaRepository.findAll();
    }

    @Override
    public Boleta findBoletaById(Long id) {
        return boletaRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        boletaRepository.deleteById(id);
    }

    @Override
    public List<Servicio> findServicioByTermino(String termino) {
        return servicioRepository.findByNombre(termino);
    }
}
