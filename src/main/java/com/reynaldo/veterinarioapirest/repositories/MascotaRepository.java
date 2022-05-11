package com.reynaldo.veterinarioapirest.repositories;

import com.reynaldo.veterinarioapirest.models.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MascotaRepository extends JpaRepository<Mascota,Long> {
}
