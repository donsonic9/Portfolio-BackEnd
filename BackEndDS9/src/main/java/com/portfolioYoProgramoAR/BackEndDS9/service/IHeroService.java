
package com.portfolioYoProgramoAR.BackEndDS9.service;

import com.portfolioYoProgramoAR.BackEndDS9.model.Hero;
import java.util.List;


public interface IHeroService {
    
    public List <Hero> verHero();
    
    public void crearHero(Hero her);
    
    public void borrarHero(Long id);
    
    public void editarHero(Hero her);
    
}
