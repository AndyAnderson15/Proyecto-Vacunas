package com.vacunas.vacunas.controller;

import com.vacunas.vacunas.services.EmpleadoService;
import com.vacunas.vacunas.model.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.net.URI;
import java.util.List;


@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.OPTIONS,RequestMethod.GET,
        RequestMethod.POST,RequestMethod.DELETE})
@RequestMapping ("/api/empleado")

public class EmpleadoApiController {

    @Autowired
    private EmpleadoService empleadoService;




    @GetMapping("/listall")
    private ResponseEntity<List<Empleado>> getAllEmpleados (){
        List<Empleado> empleadoListAll = empleadoService.getAllEmpleados();
        try {
            return ResponseEntity.ok(empleadoListAll);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    };

    @PostMapping("/save")
    @ResponseBody
    private ResponseEntity<Empleado> saveEmpleado (@RequestBody Empleado empleado){
        Empleado empleadoCreate = empleadoService.create(empleado);

        try {
            return ResponseEntity.created(new URI("/api/hulkstore/save"+empleadoCreate.getIdEmpleado())).body(empleadoCreate);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    };

    @DeleteMapping("/delete/{id}")
    private ResponseEntity deleteEmpleado (@PathVariable Long id){
        empleadoService.deleteById(id);
        try {
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    };

    @PostMapping("/update")
    @ResponseBody
    private ResponseEntity<Empleado> updateEmpleado (@RequestBody Empleado empleado){
        Empleado empleadoCreate = empleadoService.create(empleado);

        try {
            return ResponseEntity.created(new URI("/api/hulkstore/save"+empleadoCreate.getIdEmpleado())).body(empleadoCreate);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    };










}
