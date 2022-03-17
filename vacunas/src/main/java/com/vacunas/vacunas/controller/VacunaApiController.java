package com.vacunas.vacunas.controller;

import com.vacunas.vacunas.model.Vacuna;
import com.vacunas.vacunas.services.VacunaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;


@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.OPTIONS,RequestMethod.GET,
        RequestMethod.POST,RequestMethod.DELETE})
@RequestMapping("/api/vacuna")

public class VacunaApiController {

    @Autowired
    private VacunaService vacunaService;

    @GetMapping("/listall")
    private ResponseEntity<List<Vacuna>> getAllVacuna (){
        List<Vacuna> vacunaListAll = vacunaService.getAllVacuna();
        try {
            return ResponseEntity.ok(vacunaListAll);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    };

    @PostMapping("/save")
    @ResponseBody
    private ResponseEntity<Vacuna> saveVacuna (@RequestBody Vacuna vacuna){
        Vacuna vacunaCreate = vacunaService.create(vacuna);

        try {
            return ResponseEntity.created(new URI("/api/hulkstore/save"+vacunaCreate.getIdVacuna())).body(vacunaCreate);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    };


    @DeleteMapping("/delete/{id}")
    private ResponseEntity deleteVacuna (@PathVariable Long id){
        vacunaService.deleteById(id);
        try {
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    };


    @PostMapping("/update")
    @ResponseBody
    private ResponseEntity<Vacuna> updateEmpleado (@RequestBody Vacuna vacuna){
        Vacuna vacunaCreate = vacunaService.create(vacuna);

        try {
            return ResponseEntity.created(new URI("/api/hulkstore/save"+vacunaCreate.getIdVacuna())).body(vacunaCreate);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    };











}
