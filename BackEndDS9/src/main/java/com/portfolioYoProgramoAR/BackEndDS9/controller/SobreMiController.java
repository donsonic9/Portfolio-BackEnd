
package com.portfolioYoProgramoAR.BackEndDS9.controller;

import com.portfolioYoProgramoAR.BackEndDS9.model.SobreMi;
import com.portfolioYoProgramoAR.BackEndDS9.service.ISobreMiService;
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
public class SobreMiController {
    
    @Autowired
    public ISobreMiService sobremiServ;
    
    @GetMapping ("/sobremi/ver")
    @ResponseBody
    public List <SobreMi> verSobreMi () {
        return sobremiServ.verSobreMi();
    }
    
    @PostMapping ("/sobremi/crear")
    public void crearSobreMi(@RequestBody SobreMi sobrem) {
        sobremiServ.crearSobreMi(sobrem);
    }
    
    @DeleteMapping ("/sobremi/borrar/{id}")
    public void borrarSobreMi(@PathVariable Long id) {
        sobremiServ.borrarSobreMi(id);
    }
    
    @PutMapping ("/sobremi/editar")
    public void editarSobreMi(@RequestBody SobreMi sobrem) {
        sobremiServ.editarSobreMi(sobrem);
    }
    
}
