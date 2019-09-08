
package dev.muldev.ms.dto;

import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="CARTELES")
public class CartelPelicula {
    @Id
    @Column(name="ID_PELICULA")
    private int id;
    

    @Lob
    @Column(name="CARTEL_PELICULA")
    private byte[] image;

    public CartelPelicula(int id, byte[] image) {
        this.id = id;
        this.image = image;
    }

    public CartelPelicula() {
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    
    
    

    
    
    
    
}
