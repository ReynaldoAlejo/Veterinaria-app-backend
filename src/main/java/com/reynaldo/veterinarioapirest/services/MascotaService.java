package com.reynaldo.veterinarioapirest.services;


import com.reynaldo.veterinarioapirest.models.Mascota;

import java.util.List;

public interface MascotaService {
    public Mascota save(Mascota mascota);
    public List<Mascota> findAll();
    public Mascota findById(Long id);
    public void delete(Long id);
}

