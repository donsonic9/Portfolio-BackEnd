
package com.portfolioYoProgramoAR.BackEndDS9.controller;

import com.portfolioYoProgramoAR.BackEndDS9.model.Experiencia;
import com.portfolioYoProgramoAR.BackEndDS9.service.IExperienciaService;
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
public class ExperienciaController {
    
    @Autowired
    public IExperienciaService expeServ;
    
    @GetMapping ("/experiencia/ver")
    @ResponseBody
    public List <Experiencia> verExperiencia() {
        return expeServ.verExperiencia();
    }
    
    @PostMapping ("/experiencia/crear")
    public void crearExperiencia(@RequestBody Experiencia expe) {
        expeServ.crearExperiencia(expe);
    }
    
    @DeleteMapping ("/experiencia/borrar/{id}")
    public void borrarExperiencia (@PathVariable Long id) {
        expeServ.borrarExperiencia(id);
    }
    
    @PutMapping ("/experiencia/editar")
    public void editarExperiencia(@RequestBody Experiencia expe) {
        expeServ.editarExperiencia(expe);
    }
    
}
