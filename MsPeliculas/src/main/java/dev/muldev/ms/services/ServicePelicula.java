
package dev.muldev.ms.services;

import dev.muldev.ms.dto.Pelicula;
import java.util.List;


public interface ServicePelicula {
    public int altaPelicula(Pelicula p);
    public int bajaPelicula(int id);
    public List <Pelicula> listarPeliculas();
    public Pelicula getPelicula(int id);
}
