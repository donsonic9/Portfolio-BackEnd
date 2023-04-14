
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
public class Experiencia {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String logo_url;
    private String posicionYTiempo;
    private String description;

    public Experiencia() {
    }

    public Experiencia(Long id, String logo_url, String posicionYTiempo, String description) {
        this.id = id;
        this.logo_url = logo_url;
        this.posicionYTiempo = posicionYTiempo;
        this.description = description;
    }
    
    
    
}
