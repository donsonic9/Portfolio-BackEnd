
package com.portfolioYoProgramoAR.BackEndDS9.controller;

import com.portfolioYoProgramoAR.BackEndDS9.model.HabilidadTecnica;
import com.portfolioYoProgramoAR.BackEndDS9.service.IHabilidadTecnicaService;
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
public class HabilidadTecnicaController {
    
    @Autowired
    public IHabilidadTecnicaService habtecServ;
    
    @GetMapping ("/habilidadtecnica/ver")
    @ResponseBody
    public List <HabilidadTecnica> verHabilidadTecnica() {
        return habtecServ.verHabilidadTecnica();
    }
    
    @PostMapping ("/habilidadtecnica/crear")
    public void crearHabilidadTecnica(@RequestBody HabilidadTecnica habtec) {
        habtecServ.crearHabilidadTecnica(habtec);
    }
    
    @DeleteMapping ("/habilidadtecnica/borrar/{id}")
    public void borrarHabilidadTecnica(@PathVariable Long id) {
        habtecServ.borrarHabilidadTecnica(id);
    }
    
    @PutMapping ("/habilidadtecnica/editar")
    public void editarHabilidadTecnica(@RequestBody HabilidadTecnica habtec) {
        habtecServ.editarHabilidadTecnica(habtec);
    }
    
}
