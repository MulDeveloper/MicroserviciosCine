
package dev.muldev.ms.dao;

import dev.muldev.ms.dto.CartelPelicula;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DAOCartel extends JpaRepository<CartelPelicula, Integer> {
    
}
