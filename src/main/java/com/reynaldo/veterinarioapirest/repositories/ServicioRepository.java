package com.reynaldo.veterinarioapirest.repositories;

import com.reynaldo.veterinarioapirest.models.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ServicioRepository extends JpaRepository<Servicio,Long> {
    @Query("select s from Servicio s where  s.nombre like %?1% ")
    public List<Servicio> findByNombre(String termino);
}
