
package com.portfolioYoProgramoAR.BackEndDS9.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Mensaje {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String fecha;
    private String username;
    private String mensaje;
    private String email;
    private String img_photo;

    public Mensaje() {
    }

    public Mensaje(Long id, String fecha, String username, String mensaje, String email, String img_photo) {
        this.id = id;
        this.fecha = fecha;
        this.username = username;
        this.mensaje = mensaje;
        this.email = email;
        this.img_photo = img_photo;
    }
    
    
}
