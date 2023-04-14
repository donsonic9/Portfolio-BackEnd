
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
public class DescripcionEducacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String description;

    public DescripcionEducacion() {
    }

    public DescripcionEducacion(Long id, String description) {
        this.id = id;
        this.description = description;
    }
    
    
    
}
