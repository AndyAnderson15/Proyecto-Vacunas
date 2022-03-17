package com.vacunas.vacunas.services;


import com.vacunas.vacunas.model.Vacuna;
import com.vacunas.vacunas.repository.VacunaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VacunaService {

    @Autowired
    private VacunaRepository vacunaRepository;


    public List<Vacuna> getAllVacuna() {
        return vacunaRepository.findAll(Sort.by(Sort.Direction.ASC, "idVacuna"));
    }

    public Vacuna create (Vacuna vacuna) {
        return vacunaRepository.save(vacuna);
    }

    public void deleteById (Long id) {
        vacunaRepository.deleteById(id);
    }




}
