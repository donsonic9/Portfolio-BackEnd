
package com.portfolioYoProgramoAR.BackEndDS9.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class FraseContacto {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String frase_descriptiva;
    private String frase_contacto;

    public FraseContacto() {
    }

    public FraseContacto(Long id, String frase_descriptiva, String frase_contacto) {
        this.id = id;
        this.frase_descriptiva = frase_descriptiva;
        this.frase_contacto = frase_contacto;
    }
    
    
    
}
