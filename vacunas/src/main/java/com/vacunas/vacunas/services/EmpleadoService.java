package com.vacunas.vacunas.services;


import com.vacunas.vacunas.model.Empleado;
import com.vacunas.vacunas.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmpleadoService {


    @Autowired
    private EmpleadoRepository empleadoRepository;


    public List<Empleado> getAllEmpleados() {
        return empleadoRepository.findAll(Sort.by(Sort.Direction.ASC, "idEmpleado"));
    }

    public Empleado create (Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    public void deleteById (Long id) {
        empleadoRepository.deleteById(id);
    }







}
