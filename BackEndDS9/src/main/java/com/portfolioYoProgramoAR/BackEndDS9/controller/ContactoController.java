
package com.portfolioYoProgramoAR.BackEndDS9.controller;

import com.portfolioYoProgramoAR.BackEndDS9.model.Contacto;
import com.portfolioYoProgramoAR.BackEndDS9.service.IContactoService;
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

//Esto es un comentario
@RestController
public class ContactoController {
    
    @Autowired
    public IContactoService conServ;
    
    @GetMapping ("/contacto/ver")
    @ResponseBody
    public List <Contacto> verContacto() {
        return conServ.verContacto();
    }
    
    @PostMapping ("/contacto/crear/")
    public void crearContacto(@RequestBody Contacto con) {
        conServ.crearContacto(con);
    }
    
    @DeleteMapping ("/contacto/borrar/{id}")
    public void borrarContacto(@PathVariable Long id) {
        conServ.borrarContacto(id);
    }
    
    @PutMapping ("/contacto/editar/")
    public void editarContacto(@RequestBody Contacto con) {
        conServ.editarContacto(con);
    }
    
}
