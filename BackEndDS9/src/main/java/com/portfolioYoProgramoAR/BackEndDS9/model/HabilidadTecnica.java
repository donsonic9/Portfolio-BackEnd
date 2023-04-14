
package com.portfolioYoProgramoAR.BackEndDS9.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class HabilidadTecnica {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String logo_url;
    private String nombre;
    //El nivel aparece en una tabla distinta, pero por ahora, la agregamos aca para facilitar 
    //el codigo. Si es necesario, creamos toda la estructura solo para la tabla NIVEL.
    private String nivel_o_idioma;

    public HabilidadTecnica() {
    }

    public HabilidadTecnica(Long id, String logo_url, String nombre, String nivel_o_idioma) {
        this.id = id;
        this.logo_url = logo_url;
        this.nombre = nombre;
        this.nivel_o_idioma = nivel_o_idioma;
    }
    
    
    
}
