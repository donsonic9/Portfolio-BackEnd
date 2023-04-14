
package com.portfolioYoProgramoAR.BackEndDS9.controller;

import com.portfolioYoProgramoAR.BackEndDS9.model.FraseContacto;
import com.portfolioYoProgramoAR.BackEndDS9.service.IFraseContactoService;
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
public class FraseContactoController {
    
    @Autowired
    public IFraseContactoService fraconServ;
    
    @GetMapping ("/frasecontacto/ver")
    @ResponseBody
    public List <FraseContacto> verFraseContacto() {
        return fraconServ.verFraseContacto();
    }
    
    @PostMapping ("/frasecontacto/crear")
    public void crearFraseContacto(@RequestBody FraseContacto fracon) {
        fraconServ.crearFraseContacto(fracon);
    }
    
    @DeleteMapping ("/frasecontacto/borrar/{id}")
    public void borrarFraseContacto(@PathVariable Long id) {
        fraconServ.borrarFraseContacto(id);
    }
    
    @PutMapping ("/frasecontacto/editar")
    public void editarFraseContacto(@RequestBody FraseContacto fracon) {
        fraconServ.editarFraseContacto(fracon);
    }
}
