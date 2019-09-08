
package dev.muldev.ms.dao;

import dev.muldev.ms.dto.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DAOPelicula extends JpaRepository <Pelicula, Integer>{
    
}
