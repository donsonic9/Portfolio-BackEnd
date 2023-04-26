
package com.portfolioYoProgramoAR.BackEndDS9.controller;

import com.portfolioYoProgramoAR.BackEndDS9.model.DescripcionEducacion;
import com.portfolioYoProgramoAR.BackEndDS9.service.IDescripcionEducacionService;
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
public class DescripcionEducacionController {
    
    @Autowired
    public IDescripcionEducacionService desceduServ;
    
    @GetMapping ("/descripcioneducacion/ver")
    @ResponseBody
    public List <DescripcionEducacion> verDescripcionEducacion() {
        return desceduServ.verDescripcionEducacion();
    }
    
    @PostMapping ("/descripcioneducacion/crear")
    public void crearDescripcionEducacion(@RequestBody DescripcionEducacion descedu) {
        desceduServ.crearDescripcionEducacion(descedu);
    }
    
    @DeleteMapping ("/descripcioneducacion/borrar/{id}")
    public void borrarDescripcionEducacion(@PathVariable Long id) {
        desceduServ.borrarDescripcionEducacion(id);
    }
    
    @PutMapping ("/descripcioneducacion/editar/")
    public void editarDescripcionEducacion(@RequestBody DescripcionEducacion descedu) {
        desceduServ.editarDescripcionEducacion(descedu);
    }
    
}
