
package com.portfolioYoProgramoAR.BackEndDS9.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Hero {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String img_profile;
    private String saludo;
    private String profesion;

    //Constructor vacio
    public Hero() {
    }
    
    //Constructor con parametros

    public Hero(Long id, String img_profile, String saludo, String profesion) {
        this.id = id;
        this.img_profile = img_profile;
        this.saludo = saludo;
        this.profesion = profesion;
    }
    
    
}
