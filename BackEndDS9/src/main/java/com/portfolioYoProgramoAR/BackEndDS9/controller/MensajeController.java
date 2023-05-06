
package com.portfolioYoProgramoAR.BackEndDS9.controller;

import com.portfolioYoProgramoAR.BackEndDS9.model.Mensaje;
import com.portfolioYoProgramoAR.BackEndDS9.service.IMensajeService;
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
public class MensajeController {
    
    @Autowired
    public IMensajeService menServ;
    
    @GetMapping ("/mensaje/ver")
    @ResponseBody
    public List <Mensaje> verMensaje() {
        return menServ.verMensaje();
    }
    
    @PostMapping ("/mensaje/crear/")
    public void crearMensaje(@RequestBody Mensaje men) {
        menServ.crearMensaje(men);
    }
    
    @DeleteMapping ("/mensaje/borrar{id}")
    public void borrarMensaje (@PathVariable Long id) {
        menServ.borrarMensaje(id);
    }
    
    @PutMapping ("/mensaje/editar/")
    public void editarMensaje(@RequestBody Mensaje men) {
        menServ.editarMensaje(men);
    }
    
}
