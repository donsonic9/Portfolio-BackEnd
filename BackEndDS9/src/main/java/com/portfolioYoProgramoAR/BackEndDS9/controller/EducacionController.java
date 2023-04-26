
package com.portfolioYoProgramoAR.BackEndDS9.controller;

import com.portfolioYoProgramoAR.BackEndDS9.model.Educacion;
import com.portfolioYoProgramoAR.BackEndDS9.service.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EducacionController {
    
    @Autowired
    public IEducacionService eduServ;
    
    @GetMapping ("/educacion/ver")
    @ResponseBody
    public List <Educacion> verEducacion() {
        return eduServ.verEducacion();
    }
    
    @PostMapping ("/educacion/crear/")
    public void crearEducacion(@RequestBody Educacion edu) {
        eduServ.crearEducacion(edu);
    }
    
    @DeleteMapping ("/educacion/borrar{id}")
    public void borrarEducacion(@PathVariable Long id) {
        eduServ.borrarEducacion(id);
    }
    
    @PutMapping ("/educacion/editar/")
    public void editarEducacion(@RequestBody Educacion edu) {
        eduServ.editarEducacion(edu);
    }
    
}
