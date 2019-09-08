
package dev.muldev.ms.mstrailer.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TRAILER_PELICULAS")
public class TrailerPelicula {

    @Id
    @Column(name="ID_PELICULA")
    private int id;
    @Column(name="LINK_PELICULA")
    private String link;

    public TrailerPelicula() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    
}
