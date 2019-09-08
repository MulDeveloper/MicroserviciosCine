
package dev.muldev.ms.cartelera.dao;

import dev.muldev.ms.cartelera.dto.CartelPelicula;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DAOCartel extends JpaRepository<CartelPelicula, Integer>{
    
}
