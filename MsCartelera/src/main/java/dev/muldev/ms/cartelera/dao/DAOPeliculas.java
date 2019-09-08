
package dev.muldev.ms.cartelera.dao;

import dev.muldev.ms.cartelera.dto.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DAOPeliculas extends JpaRepository <Pelicula, Integer>{
    
}
