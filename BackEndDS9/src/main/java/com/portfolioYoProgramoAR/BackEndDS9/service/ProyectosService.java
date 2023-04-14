
package com.portfolioYoProgramoAR.BackEndDS9.service;

import com.portfolioYoProgramoAR.BackEndDS9.model.Proyectos;
import com.portfolioYoProgramoAR.BackEndDS9.repository.ProyectosRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectosService {
    
    @Autowired
    public ProyectosRepository proyRepo;

    @Override
    public List<Proyectos> verProyectos() {
        return proyRepo.findAll();
    }

    @Override
    public void crearProyectos(Proyectos proy) {
        proyRepo.save(proy);
    }

    @Override
    public void borrarProyectos(Long id) {
        proyRepo.deleteById(id);
    }

    @Override
    public void editarProyectos(Proyectos proy) {
        Optional <Proyectos> proypo = proyRepo.findById(proy.getId());
        
        if(proypo.isPresent()) {
            Proyectos proymod = proypo.get();
            proymod.setNombre(proy.getNombre());
            proymod.setDescripcion(proy.getDescripcion());
            proymod.setUrl_imagen(proy.getUrl_imagen());
            proymod.setUrl_github(proy.getUrl_github());
            proymod.setUrl_website(proy.getUrl_website());
            proyRepo.save(proymod);
        } else {
            throw new RuntimeException ("Proyecto not found for id: " + proy.getId());
        }
    }
    
}
