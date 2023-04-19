
package com.portfolioYoProgramoAR.BackEndDS9.controller;

import com.portfolioYoProgramoAR.BackEndDS9.model.Hero;
import com.portfolioYoProgramoAR.BackEndDS9.service.IHeroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin (origins = "*")
public class HeroController {
    
    @Autowired
    public IHeroService heroServ;
    
    @GetMapping ("/hero/ver")
    @ResponseBody
    public List <Hero> verHero () {
        return heroServ.verHero();
    }
    
    @PostMapping ("/hero/crear")
    public void crearHero(@RequestBody Hero her) {
        heroServ.crearHero(her);
    }
    
    @DeleteMapping ("/hero/borrar/{id}")
    public void borrarHero(@PathVariable Long id) {
        heroServ.borrarHero(id);
    }
    
    @PutMapping ("/hero/editar")
    public void editarHero(@RequestBody Hero her) {
        heroServ.editarHero(her);
    }
}
