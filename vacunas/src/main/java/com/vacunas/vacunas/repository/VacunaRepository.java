package com.vacunas.vacunas.repository;

import com.vacunas.vacunas.model.Vacuna;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VacunaRepository extends JpaRepository<Vacuna, Long> {
}
