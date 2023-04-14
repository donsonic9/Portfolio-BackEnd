
package com.portfolioYoProgramoAR.BackEndDS9.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Contacto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String medio_de_contacto;
    private String url_medio;

    public Contacto() {
    }

    public Contacto(Long id, String medio_de_contacto, String url_medio) {
        this.id = id;
        this.medio_de_contacto = medio_de_contacto;
        this.url_medio = url_medio;
    }
    
    
    
}
