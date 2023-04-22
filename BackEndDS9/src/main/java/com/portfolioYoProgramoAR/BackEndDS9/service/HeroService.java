
package com.portfolioYoProgramoAR.BackEndDS9.service;

import com.portfolioYoProgramoAR.BackEndDS9.model.Hero;
import com.portfolioYoProgramoAR.BackEndDS9.repository.HeroRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeroService implements IHeroService {
    
    @Autowired
    public HeroRepository heroRepo;

    @Override
    public List<Hero> verHero() {
        return heroRepo.findAll();
    }

    @Override
    public void crearHero(Hero her) {
        heroRepo.save(her);
    }

    @Override
    public void borrarHero(Long id) {
        heroRepo.deleteById(id);
    }
    
    @Override
    public Hero buscarHero(Long id) {
        Hero herobus = heroRepo.findById(id).orElse(null);
        return herobus;
    }

    @Override
    public void editarHero(Hero her) {
        Optional <Hero> heroro = heroRepo.findById(her.getId());
        
        if(heroro.isPresent()){
            Hero heromod = heroro.get();
            heromod.setImg_profile(her.getImg_profile());
            heromod.setProfesion(her.getProfesion());
            heromod.setSaludo(her.getSaludo());
            heroRepo.save(heromod);
        } else {
            throw new RuntimeException("Hero not found for id :: " + her.getId());
        }
    }

    
    
}
