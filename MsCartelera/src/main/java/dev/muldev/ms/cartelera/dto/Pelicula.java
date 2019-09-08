package dev.muldev.ms.cartelera.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="PELICULAS")
public class Pelicula {
    
    @Id
    @Column(name="ID_PELICULA")
    @GenericGenerator(name="idValor" , strategy="increment")
    @GeneratedValue(generator="idValor")
    private int id;
    @Column(name="NOM_PELICULA")
    private String nombrePelicula;
    @Column(name="DIR_PELICULA")
    private String director;
    @Column(name="FECHA_PELICULA")
    private String fechaEstreno;
    @Lob
    private Byte[] image;

    public Pelicula() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(String fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }

    
    
    
}
