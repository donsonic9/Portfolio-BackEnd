
package com.portfolioYoProgramoAR.BackEndDS9.controller;

import com.portfolioYoProgramoAR.BackEndDS9.model.Proyectos;
import com.portfolioYoProgramoAR.BackEndDS9.service.IProyectosService;
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
public class ProyectosController {
    
    @Autowired
    public IProyectosService proyServ;
    
    @GetMapping ("/proyectos/ver")
    @ResponseBody
    public List <Proyectos> verProyectos() {
        return proyServ.verProyectos();
    }
    
    @PostMapping ("/proyectos/crear")
    public void crearProyectos(@RequestBody Proyectos proy) {
        proyServ.crearProyectos(proy);
    }
    
    @DeleteMapping ("/proyectos/borrar/{id}")
    public void borrarProyectos(@PathVariable Long id) {
        proyServ.borrarProyectos(id);
    }
    
    @PutMapping ("/proyectos/editar")
    public void editarProyectos(@RequestBody Proyectos proy) {
        proyServ.editarProyectos(proy);
    }
    
}
