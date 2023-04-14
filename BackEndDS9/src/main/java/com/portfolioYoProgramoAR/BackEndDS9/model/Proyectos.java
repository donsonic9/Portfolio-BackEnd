
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
public class Proyectos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private String descripcion;
    private String url_imagen;
    private String url_github;
    private String url_website;

    public Proyectos() {
    }

    public Proyectos(Long id, String nombre, String descripcion, String url_imagen, String url_github, String url_website) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.url_imagen = url_imagen;
        this.url_github = url_github;
        this.url_website = url_website;
    }
    
    
    
}
