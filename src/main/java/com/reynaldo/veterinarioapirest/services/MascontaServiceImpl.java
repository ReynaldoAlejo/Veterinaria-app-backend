package com.reynaldo.veterinarioapirest.services;

import com.reynaldo.veterinarioapirest.models.Cliente;
import com.reynaldo.veterinarioapirest.models.Mascota;
import com.reynaldo.veterinarioapirest.repositories.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascontaServiceImpl implements  MascotaService{

    @Autowired
    MascotaRepository mascotaRepository;
    @Override
    public Mascota save(Mascota mascota) {
        return mascotaRepository.save(mascota);
    }

    @Override
    public List<Mascota> findAll() {
        return mascotaRepository.findAll();
    }

    @Override
    public Mascota findById(Long id) {
        return mascotaRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        mascotaRepository.deleteById(id);
    }
}
