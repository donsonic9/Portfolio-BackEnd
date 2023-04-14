
package com.portfolioYoProgramoAR.BackEndDS9.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Alex
 */
@Getter @Setter
@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String institucion;
    private String tituloYTiempo;
    private String description;
    private String img_url;

    public Educacion() {
    }

    public Educacion(Long id, String institucion, String tituloYTiempo, String description, String img_url) {
        this.id = id;
        this.institucion = institucion;
        this.tituloYTiempo = tituloYTiempo;
        this.description = description;
        this.img_url = img_url;
    }
    
    
    
}
